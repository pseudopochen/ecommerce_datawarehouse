// ORM class for table 'ads_order_by_province'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 17 15:00:54 MDT 2022
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

public class ads_order_by_province extends SqoopRecord  implements DBWritable, Writable {
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
  public ads_order_by_province with_dt(java.sql.Date dt) {
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
  public ads_order_by_province with_recent_days(Long recent_days) {
    this.recent_days = recent_days;
    return this;
  }
  private String province_id;
  public String get_province_id() {
    return province_id;
  }
  public void set_province_id(String province_id) {
    this.province_id = province_id;
  }
  public ads_order_by_province with_province_id(String province_id) {
    this.province_id = province_id;
    return this;
  }
  private String province_name;
  public String get_province_name() {
    return province_name;
  }
  public void set_province_name(String province_name) {
    this.province_name = province_name;
  }
  public ads_order_by_province with_province_name(String province_name) {
    this.province_name = province_name;
    return this;
  }
  private String area_code;
  public String get_area_code() {
    return area_code;
  }
  public void set_area_code(String area_code) {
    this.area_code = area_code;
  }
  public ads_order_by_province with_area_code(String area_code) {
    this.area_code = area_code;
    return this;
  }
  private String iso_code;
  public String get_iso_code() {
    return iso_code;
  }
  public void set_iso_code(String iso_code) {
    this.iso_code = iso_code;
  }
  public ads_order_by_province with_iso_code(String iso_code) {
    this.iso_code = iso_code;
    return this;
  }
  private String iso_code_3166_2;
  public String get_iso_code_3166_2() {
    return iso_code_3166_2;
  }
  public void set_iso_code_3166_2(String iso_code_3166_2) {
    this.iso_code_3166_2 = iso_code_3166_2;
  }
  public ads_order_by_province with_iso_code_3166_2(String iso_code_3166_2) {
    this.iso_code_3166_2 = iso_code_3166_2;
    return this;
  }
  private Long order_count;
  public Long get_order_count() {
    return order_count;
  }
  public void set_order_count(Long order_count) {
    this.order_count = order_count;
  }
  public ads_order_by_province with_order_count(Long order_count) {
    this.order_count = order_count;
    return this;
  }
  private java.math.BigDecimal order_amount;
  public java.math.BigDecimal get_order_amount() {
    return order_amount;
  }
  public void set_order_amount(java.math.BigDecimal order_amount) {
    this.order_amount = order_amount;
  }
  public ads_order_by_province with_order_amount(java.math.BigDecimal order_amount) {
    this.order_amount = order_amount;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_order_by_province)) {
      return false;
    }
    ads_order_by_province that = (ads_order_by_province) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.recent_days == null ? that.recent_days == null : this.recent_days.equals(that.recent_days));
    equal = equal && (this.province_id == null ? that.province_id == null : this.province_id.equals(that.province_id));
    equal = equal && (this.province_name == null ? that.province_name == null : this.province_name.equals(that.province_name));
    equal = equal && (this.area_code == null ? that.area_code == null : this.area_code.equals(that.area_code));
    equal = equal && (this.iso_code == null ? that.iso_code == null : this.iso_code.equals(that.iso_code));
    equal = equal && (this.iso_code_3166_2 == null ? that.iso_code_3166_2 == null : this.iso_code_3166_2.equals(that.iso_code_3166_2));
    equal = equal && (this.order_count == null ? that.order_count == null : this.order_count.equals(that.order_count));
    equal = equal && (this.order_amount == null ? that.order_amount == null : this.order_amount.equals(that.order_amount));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_order_by_province)) {
      return false;
    }
    ads_order_by_province that = (ads_order_by_province) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.recent_days == null ? that.recent_days == null : this.recent_days.equals(that.recent_days));
    equal = equal && (this.province_id == null ? that.province_id == null : this.province_id.equals(that.province_id));
    equal = equal && (this.province_name == null ? that.province_name == null : this.province_name.equals(that.province_name));
    equal = equal && (this.area_code == null ? that.area_code == null : this.area_code.equals(that.area_code));
    equal = equal && (this.iso_code == null ? that.iso_code == null : this.iso_code.equals(that.iso_code));
    equal = equal && (this.iso_code_3166_2 == null ? that.iso_code_3166_2 == null : this.iso_code_3166_2.equals(that.iso_code_3166_2));
    equal = equal && (this.order_count == null ? that.order_count == null : this.order_count.equals(that.order_count));
    equal = equal && (this.order_amount == null ? that.order_amount == null : this.order_amount.equals(that.order_amount));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.recent_days = JdbcWritableBridge.readLong(2, __dbResults);
    this.province_id = JdbcWritableBridge.readString(3, __dbResults);
    this.province_name = JdbcWritableBridge.readString(4, __dbResults);
    this.area_code = JdbcWritableBridge.readString(5, __dbResults);
    this.iso_code = JdbcWritableBridge.readString(6, __dbResults);
    this.iso_code_3166_2 = JdbcWritableBridge.readString(7, __dbResults);
    this.order_count = JdbcWritableBridge.readLong(8, __dbResults);
    this.order_amount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.recent_days = JdbcWritableBridge.readLong(2, __dbResults);
    this.province_id = JdbcWritableBridge.readString(3, __dbResults);
    this.province_name = JdbcWritableBridge.readString(4, __dbResults);
    this.area_code = JdbcWritableBridge.readString(5, __dbResults);
    this.iso_code = JdbcWritableBridge.readString(6, __dbResults);
    this.iso_code_3166_2 = JdbcWritableBridge.readString(7, __dbResults);
    this.order_count = JdbcWritableBridge.readLong(8, __dbResults);
    this.order_amount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
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
    JdbcWritableBridge.writeString(province_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(province_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(iso_code, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(iso_code_3166_2, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(order_count, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_amount, 9 + __off, 3, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeLong(recent_days, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(province_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(province_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(iso_code, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(iso_code_3166_2, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(order_count, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_amount, 9 + __off, 3, __dbStmt);
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
        this.province_id = null;
    } else {
    this.province_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.province_name = null;
    } else {
    this.province_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.area_code = null;
    } else {
    this.area_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.iso_code = null;
    } else {
    this.iso_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.iso_code_3166_2 = null;
    } else {
    this.iso_code_3166_2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_count = null;
    } else {
    this.order_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.order_amount = null;
    } else {
    this.order_amount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.province_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_id);
    }
    if (null == this.province_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_name);
    }
    if (null == this.area_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area_code);
    }
    if (null == this.iso_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, iso_code);
    }
    if (null == this.iso_code_3166_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, iso_code_3166_2);
    }
    if (null == this.order_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_count);
    }
    if (null == this.order_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.order_amount, __dataOut);
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
    if (null == this.province_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_id);
    }
    if (null == this.province_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_name);
    }
    if (null == this.area_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area_code);
    }
    if (null == this.iso_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, iso_code);
    }
    if (null == this.iso_code_3166_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, iso_code_3166_2);
    }
    if (null == this.order_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_count);
    }
    if (null == this.order_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.order_amount, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(province_id==null?"null":province_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_name==null?"null":province_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area_code==null?"null":area_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iso_code==null?"null":iso_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iso_code_3166_2==null?"null":iso_code_3166_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_count==null?"null":"" + order_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_amount==null?"null":order_amount.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(province_id==null?"null":province_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_name==null?"null":province_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area_code==null?"null":area_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iso_code==null?"null":iso_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iso_code_3166_2==null?"null":iso_code_3166_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_count==null?"null":"" + order_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_amount==null?"null":order_amount.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.province_id = null; } else {
      this.province_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.province_name = null; } else {
      this.province_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.area_code = null; } else {
      this.area_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.iso_code = null; } else {
      this.iso_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.iso_code_3166_2 = null; } else {
      this.iso_code_3166_2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_count = null; } else {
      this.order_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_amount = null; } else {
      this.order_amount = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.province_id = null; } else {
      this.province_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.province_name = null; } else {
      this.province_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.area_code = null; } else {
      this.area_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.iso_code = null; } else {
      this.iso_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.iso_code_3166_2 = null; } else {
      this.iso_code_3166_2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_count = null; } else {
      this.order_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_amount = null; } else {
      this.order_amount = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_order_by_province o = (ads_order_by_province) super.clone();
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
    return o;
  }

  public void clone0(ads_order_by_province o) throws CloneNotSupportedException {
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("recent_days", this.recent_days);
    __sqoop$field_map.put("province_id", this.province_id);
    __sqoop$field_map.put("province_name", this.province_name);
    __sqoop$field_map.put("area_code", this.area_code);
    __sqoop$field_map.put("iso_code", this.iso_code);
    __sqoop$field_map.put("iso_code_3166_2", this.iso_code_3166_2);
    __sqoop$field_map.put("order_count", this.order_count);
    __sqoop$field_map.put("order_amount", this.order_amount);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("recent_days", this.recent_days);
    __sqoop$field_map.put("province_id", this.province_id);
    __sqoop$field_map.put("province_name", this.province_name);
    __sqoop$field_map.put("area_code", this.area_code);
    __sqoop$field_map.put("iso_code", this.iso_code);
    __sqoop$field_map.put("iso_code_3166_2", this.iso_code_3166_2);
    __sqoop$field_map.put("order_count", this.order_count);
    __sqoop$field_map.put("order_amount", this.order_amount);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("dt".equals(__fieldName)) {
      this.dt = (java.sql.Date) __fieldVal;
    }
    else    if ("recent_days".equals(__fieldName)) {
      this.recent_days = (Long) __fieldVal;
    }
    else    if ("province_id".equals(__fieldName)) {
      this.province_id = (String) __fieldVal;
    }
    else    if ("province_name".equals(__fieldName)) {
      this.province_name = (String) __fieldVal;
    }
    else    if ("area_code".equals(__fieldName)) {
      this.area_code = (String) __fieldVal;
    }
    else    if ("iso_code".equals(__fieldName)) {
      this.iso_code = (String) __fieldVal;
    }
    else    if ("iso_code_3166_2".equals(__fieldName)) {
      this.iso_code_3166_2 = (String) __fieldVal;
    }
    else    if ("order_count".equals(__fieldName)) {
      this.order_count = (Long) __fieldVal;
    }
    else    if ("order_amount".equals(__fieldName)) {
      this.order_amount = (java.math.BigDecimal) __fieldVal;
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
    else    if ("province_id".equals(__fieldName)) {
      this.province_id = (String) __fieldVal;
      return true;
    }
    else    if ("province_name".equals(__fieldName)) {
      this.province_name = (String) __fieldVal;
      return true;
    }
    else    if ("area_code".equals(__fieldName)) {
      this.area_code = (String) __fieldVal;
      return true;
    }
    else    if ("iso_code".equals(__fieldName)) {
      this.iso_code = (String) __fieldVal;
      return true;
    }
    else    if ("iso_code_3166_2".equals(__fieldName)) {
      this.iso_code_3166_2 = (String) __fieldVal;
      return true;
    }
    else    if ("order_count".equals(__fieldName)) {
      this.order_count = (Long) __fieldVal;
      return true;
    }
    else    if ("order_amount".equals(__fieldName)) {
      this.order_amount = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
