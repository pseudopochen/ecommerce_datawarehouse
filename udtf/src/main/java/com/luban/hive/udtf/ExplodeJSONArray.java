package com.luban.hive.udtf;

import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorUtils;
import org.json.JSONArray;

import java.util.ArrayList;

public class ExplodeJSONArray extends GenericUDTF {

    private PrimitiveObjectInspector inputOI;

    @Override
    public StructObjectInspector initialize(ObjectInspector[] argOIs) throws UDFArgumentException {
        if (argOIs.length != 1) {
            throw new UDFArgumentException("explode_json_array can only take one argument!");
        }
        ObjectInspector argOI = argOIs[0];
        if(argOI.getCategory() != ObjectInspector.Category.PRIMITIVE) {
            throw new UDFArgumentException("explode_json_array can only take primitive type!");
        }
        PrimitiveObjectInspector primitiveOI = (PrimitiveObjectInspector)argOI;
        if (primitiveOI.getPrimitiveCategory() != PrimitiveObjectInspector.PrimitiveCategory.STRING) {
            throw new UDFArgumentException("explode_json_array can only take string type!");
        }
        inputOI = primitiveOI;
        ArrayList<String> fieldNames = new ArrayList<>();
        fieldNames.add("item");
        ArrayList<ObjectInspector> fieldOIs = new ArrayList<>();
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);
        return ObjectInspectorFactory.getStandardStructObjectInspector(fieldNames, fieldOIs);
    }

    @Override
    public void process(Object[] objects) throws HiveException {
        String jsonArrStr = PrimitiveObjectInspectorUtils.getString(objects[0], inputOI);
        JSONArray jsonArray = new JSONArray(jsonArrStr);
        for (int i = 0; i < jsonArray.length(); i++) {
            String[] out = {jsonArray.getString(i)};
            forward(out);
        }
    }

    @Override
    public void close() throws HiveException {

    }
}
