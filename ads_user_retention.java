// ORM class for table 'ads_user_retention'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 17 15:03:00 MDT 2022
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

public class ads_user_retention extends SqoopRecord  implements DBWritable, Writable {
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
  public ads_user_retention with_dt(java.sql.Date dt) {
    this.dt = dt;
    return this;
  }
  private String create_date;
  public String get_create_date() {
    return create_date;
  }
  public void set_create_date(String create_date) {
    this.create_date = create_date;
  }
  public ads_user_retention with_create_date(String create_date) {
    this.create_date = create_date;
    return this;
  }
  private Long retention_day;
  public Long get_retention_day() {
    return retention_day;
  }
  public void set_retention_day(Long retention_day) {
    this.retention_day = retention_day;
  }
  public ads_user_retention with_retention_day(Long retention_day) {
    this.retention_day = retention_day;
    return this;
  }
  private Long retention_count;
  public Long get_retention_count() {
    return retention_count;
  }
  public void set_retention_count(Long retention_count) {
    this.retention_count = retention_count;
  }
  public ads_user_retention with_retention_count(Long retention_count) {
    this.retention_count = retention_count;
    return this;
  }
  private Long new_user_count;
  public Long get_new_user_count() {
    return new_user_count;
  }
  public void set_new_user_count(Long new_user_count) {
    this.new_user_count = new_user_count;
  }
  public ads_user_retention with_new_user_count(Long new_user_count) {
    this.new_user_count = new_user_count;
    return this;
  }
  private java.math.BigDecimal retention_rate;
  public java.math.BigDecimal get_retention_rate() {
    return retention_rate;
  }
  public void set_retention_rate(java.math.BigDecimal retention_rate) {
    this.retention_rate = retention_rate;
  }
  public ads_user_retention with_retention_rate(java.math.BigDecimal retention_rate) {
    this.retention_rate = retention_rate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_user_retention)) {
      return false;
    }
    ads_user_retention that = (ads_user_retention) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.create_date == null ? that.create_date == null : this.create_date.equals(that.create_date));
    equal = equal && (this.retention_day == null ? that.retention_day == null : this.retention_day.equals(that.retention_day));
    equal = equal && (this.retention_count == null ? that.retention_count == null : this.retention_count.equals(that.retention_count));
    equal = equal && (this.new_user_count == null ? that.new_user_count == null : this.new_user_count.equals(that.new_user_count));
    equal = equal && (this.retention_rate == null ? that.retention_rate == null : this.retention_rate.equals(that.retention_rate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_user_retention)) {
      return false;
    }
    ads_user_retention that = (ads_user_retention) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.create_date == null ? that.create_date == null : this.create_date.equals(that.create_date));
    equal = equal && (this.retention_day == null ? that.retention_day == null : this.retention_day.equals(that.retention_day));
    equal = equal && (this.retention_count == null ? that.retention_count == null : this.retention_count.equals(that.retention_count));
    equal = equal && (this.new_user_count == null ? that.new_user_count == null : this.new_user_count.equals(that.new_user_count));
    equal = equal && (this.retention_rate == null ? that.retention_rate == null : this.retention_rate.equals(that.retention_rate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.create_date = JdbcWritableBridge.readString(2, __dbResults);
    this.retention_day = JdbcWritableBridge.readLong(3, __dbResults);
    this.retention_count = JdbcWritableBridge.readLong(4, __dbResults);
    this.new_user_count = JdbcWritableBridge.readLong(5, __dbResults);
    this.retention_rate = JdbcWritableBridge.readBigDecimal(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.create_date = JdbcWritableBridge.readString(2, __dbResults);
    this.retention_day = JdbcWritableBridge.readLong(3, __dbResults);
    this.retention_count = JdbcWritableBridge.readLong(4, __dbResults);
    this.new_user_count = JdbcWritableBridge.readLong(5, __dbResults);
    this.retention_rate = JdbcWritableBridge.readBigDecimal(6, __dbResults);
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
    JdbcWritableBridge.writeString(create_date, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(retention_day, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(retention_count, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(new_user_count, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(retention_rate, 6 + __off, 3, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(create_date, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(retention_day, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(retention_count, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(new_user_count, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(retention_rate, 6 + __off, 3, __dbStmt);
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
        this.create_date = null;
    } else {
    this.create_date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.retention_day = null;
    } else {
    this.retention_day = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.retention_count = null;
    } else {
    this.retention_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.new_user_count = null;
    } else {
    this.new_user_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.retention_rate = null;
    } else {
    this.retention_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dt.getTime());
    }
    if (null == this.create_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, create_date);
    }
    if (null == this.retention_day) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.retention_day);
    }
    if (null == this.retention_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.retention_count);
    }
    if (null == this.new_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.new_user_count);
    }
    if (null == this.retention_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.retention_rate, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dt.getTime());
    }
    if (null == this.create_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, create_date);
    }
    if (null == this.retention_day) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.retention_day);
    }
    if (null == this.retention_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.retention_count);
    }
    if (null == this.new_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.new_user_count);
    }
    if (null == this.retention_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.retention_rate, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(create_date==null?"null":create_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(retention_day==null?"null":"" + retention_day, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(retention_count==null?"null":"" + retention_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(new_user_count==null?"null":"" + new_user_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(retention_rate==null?"null":retention_rate.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(dt==null?"null":"" + dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_date==null?"null":create_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(retention_day==null?"null":"" + retention_day, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(retention_count==null?"null":"" + retention_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(new_user_count==null?"null":"" + new_user_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(retention_rate==null?"null":retention_rate.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.create_date = null; } else {
      this.create_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.retention_day = null; } else {
      this.retention_day = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.retention_count = null; } else {
      this.retention_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.new_user_count = null; } else {
      this.new_user_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.retention_rate = null; } else {
      this.retention_rate = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.create_date = null; } else {
      this.create_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.retention_day = null; } else {
      this.retention_day = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.retention_count = null; } else {
      this.retention_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.new_user_count = null; } else {
      this.new_user_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.retention_rate = null; } else {
      this.retention_rate = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_user_retention o = (ads_user_retention) super.clone();
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
    return o;
  }

  public void clone0(ads_user_retention o) throws CloneNotSupportedException {
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("create_date", this.create_date);
    __sqoop$field_map.put("retention_day", this.retention_day);
    __sqoop$field_map.put("retention_count", this.retention_count);
    __sqoop$field_map.put("new_user_count", this.new_user_count);
    __sqoop$field_map.put("retention_rate", this.retention_rate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("create_date", this.create_date);
    __sqoop$field_map.put("retention_day", this.retention_day);
    __sqoop$field_map.put("retention_count", this.retention_count);
    __sqoop$field_map.put("new_user_count", this.new_user_count);
    __sqoop$field_map.put("retention_rate", this.retention_rate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("dt".equals(__fieldName)) {
      this.dt = (java.sql.Date) __fieldVal;
    }
    else    if ("create_date".equals(__fieldName)) {
      this.create_date = (String) __fieldVal;
    }
    else    if ("retention_day".equals(__fieldName)) {
      this.retention_day = (Long) __fieldVal;
    }
    else    if ("retention_count".equals(__fieldName)) {
      this.retention_count = (Long) __fieldVal;
    }
    else    if ("new_user_count".equals(__fieldName)) {
      this.new_user_count = (Long) __fieldVal;
    }
    else    if ("retention_rate".equals(__fieldName)) {
      this.retention_rate = (java.math.BigDecimal) __fieldVal;
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
    else    if ("create_date".equals(__fieldName)) {
      this.create_date = (String) __fieldVal;
      return true;
    }
    else    if ("retention_day".equals(__fieldName)) {
      this.retention_day = (Long) __fieldVal;
      return true;
    }
    else    if ("retention_count".equals(__fieldName)) {
      this.retention_count = (Long) __fieldVal;
      return true;
    }
    else    if ("new_user_count".equals(__fieldName)) {
      this.new_user_count = (Long) __fieldVal;
      return true;
    }
    else    if ("retention_rate".equals(__fieldName)) {
      this.retention_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
