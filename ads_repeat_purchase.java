// ORM class for table 'ads_repeat_purchase'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 17 15:02:07 MDT 2022
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ads_repeat_purchase extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private java.sql.Date dt;
  public java.sql.Date get_dt() {
    return dt;
  }
  public void set_dt(java.sql.Date dt) {
    this.dt = dt;
  }
  public ads_repeat_purchase with_dt(java.sql.Date dt) {
    this.dt = dt;
    return this;
  }
  private Long recent_days;
  public Long get_recent_days() {
    return recent_days;
  }
  public void set_recent_days(Long recent_days) {
    this.recent_days = recent_days;
  }
  public ads_repeat_purchase with_recent_days(Long recent_days) {
    this.recent_days = recent_days;
    return this;
  }
  private String tm_id;
  public String get_tm_id() {
    return tm_id;
  }
  public void set_tm_id(String tm_id) {
    this.tm_id = tm_id;
  }
  public ads_repeat_purchase with_tm_id(String tm_id) {
    this.tm_id = tm_id;
    return this;
  }
  private String tm_name;
  public String get_tm_name() {
    return tm_name;
  }
  public void set_tm_name(String tm_name) {
    this.tm_name = tm_name;
  }
  public ads_repeat_purchase with_tm_name(String tm_name) {
    this.tm_name = tm_name;
    return this;
  }
  private java.math.BigDecimal order_repeat_rate;
  public java.math.BigDecimal get_order_repeat_rate() {
    return order_repeat_rate;
  }
  public void set_order_repeat_rate(java.math.BigDecimal order_repeat_rate) {
    this.order_repeat_rate = order_repeat_rate;
  }
  public ads_repeat_purchase with_order_repeat_rate(java.math.BigDecimal order_repeat_rate) {
    this.order_repeat_rate = order_repeat_rate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_repeat_purchase)) {
      return false;
    }
    ads_repeat_purchase that = (ads_repeat_purchase) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.recent_days == null ? that.recent_days == null : this.recent_days.equals(that.recent_days));
    equal = equal && (this.tm_id == null ? that.tm_id == null : this.tm_id.equals(that.tm_id));
    equal = equal && (this.tm_name == null ? that.tm_name == null : this.tm_name.equals(that.tm_name));
    equal = equal && (this.order_repeat_rate == null ? that.order_repeat_rate == null : this.order_repeat_rate.equals(that.order_repeat_rate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_repeat_purchase)) {
      return false;
    }
    ads_repeat_purchase that = (ads_repeat_purchase) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.recent_days == null ? that.recent_days == null : this.recent_days.equals(that.recent_days));
    equal = equal && (this.tm_id == null ? that.tm_id == null : this.tm_id.equals(that.tm_id));
    equal = equal && (this.tm_name == null ? that.tm_name == null : this.tm_name.equals(that.tm_name));
    equal = equal && (this.order_repeat_rate == null ? that.order_repeat_rate == null : this.order_repeat_rate.equals(that.order_repeat_rate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.recent_days = JdbcWritableBridge.readLong(2, __dbResults);
    this.tm_id = JdbcWritableBridge.readString(3, __dbResults);
    this.tm_name = JdbcWritableBridge.readString(4, __dbResults);
    this.order_repeat_rate = JdbcWritableBridge.readBigDecimal(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.recent_days = JdbcWritableBridge.readLong(2, __dbResults);
    this.tm_id = JdbcWritableBridge.readString(3, __dbResults);
    this.tm_name = JdbcWritableBridge.readString(4, __dbResults);
    this.order_repeat_rate = JdbcWritableBridge.readBigDecimal(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeLong(recent_days, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(tm_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tm_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_repeat_rate, 5 + __off, 3, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeLong(recent_days, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(tm_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tm_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_repeat_rate, 5 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.dt = null;
    } else {
    this.dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.recent_days = null;
    } else {
    this.recent_days = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tm_id = null;
    } else {
    this.tm_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tm_name = null;
    } else {
    this.tm_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_repeat_rate = null;
    } else {
    this.order_repeat_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dt.getTime());
    }
    if (null == this.recent_days) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.recent_days);
    }
    if (null == this.tm_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tm_id);
    }
    if (null == this.tm_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tm_name);
    }
    if (null == this.order_repeat_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.order_repeat_rate, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dt.getTime());
    }
    if (null == this.recent_days) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.recent_days);
    }
    if (null == this.tm_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tm_id);
    }
    if (null == this.tm_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tm_name);
    }
    if (null == this.order_repeat_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.order_repeat_rate, __dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(dt==null?"null":"" + dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recent_days==null?"null":"" + recent_days, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tm_id==null?"null":tm_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tm_name==null?"null":tm_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_repeat_rate==null?"null":order_repeat_rate.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(dt==null?"null":"" + dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recent_days==null?"null":"" + recent_days, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tm_id==null?"null":tm_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tm_name==null?"null":tm_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_repeat_rate==null?"null":order_repeat_rate.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.dt = null; } else {
      this.dt = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.recent_days = null; } else {
      this.recent_days = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.tm_id = null; } else {
      this.tm_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.tm_name = null; } else {
      this.tm_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_repeat_rate = null; } else {
      this.order_repeat_rate = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.dt = null; } else {
      this.dt = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.recent_days = null; } else {
      this.recent_days = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.tm_id = null; } else {
      this.tm_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.tm_name = null; } else {
      this.tm_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_repeat_rate = null; } else {
      this.order_repeat_rate = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_repeat_purchase o = (ads_repeat_purchase) super.clone();
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
    return o;
  }

  public void clone0(ads_repeat_purchase o) throws CloneNotSupportedException {
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("recent_days", this.recent_days);
    __sqoop$field_map.put("tm_id", this.tm_id);
    __sqoop$field_map.put("tm_name", this.tm_name);
    __sqoop$field_map.put("order_repeat_rate", this.order_repeat_rate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("recent_days", this.recent_days);
    __sqoop$field_map.put("tm_id", this.tm_id);
    __sqoop$field_map.put("tm_name", this.tm_name);
    __sqoop$field_map.put("order_repeat_rate", this.order_repeat_rate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("dt".equals(__fieldName)) {
      this.dt = (java.sql.Date) __fieldVal;
    }
    else    if ("recent_days".equals(__fieldName)) {
      this.recent_days = (Long) __fieldVal;
    }
    else    if ("tm_id".equals(__fieldName)) {
      this.tm_id = (String) __fieldVal;
    }
    else    if ("tm_name".equals(__fieldName)) {
      this.tm_name = (String) __fieldVal;
    }
    else    if ("order_repeat_rate".equals(__fieldName)) {
      this.order_repeat_rate = (java.math.BigDecimal) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("dt".equals(__fieldName)) {
      this.dt = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("recent_days".equals(__fieldName)) {
      this.recent_days = (Long) __fieldVal;
      return true;
    }
    else    if ("tm_id".equals(__fieldName)) {
      this.tm_id = (String) __fieldVal;
      return true;
    }
    else    if ("tm_name".equals(__fieldName)) {
      this.tm_name = (String) __fieldVal;
      return true;
    }
    else    if ("order_repeat_rate".equals(__fieldName)) {
      this.order_repeat_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
