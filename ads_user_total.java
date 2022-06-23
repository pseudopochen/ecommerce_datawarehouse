// ORM class for table 'ads_user_total'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 17 15:03:17 MDT 2022
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

public class ads_user_total extends SqoopRecord  implements DBWritable, Writable {
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
  public ads_user_total with_dt(java.sql.Date dt) {
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
  public ads_user_total with_recent_days(Long recent_days) {
    this.recent_days = recent_days;
    return this;
  }
  private Long new_user_count;
  public Long get_new_user_count() {
    return new_user_count;
  }
  public void set_new_user_count(Long new_user_count) {
    this.new_user_count = new_user_count;
  }
  public ads_user_total with_new_user_count(Long new_user_count) {
    this.new_user_count = new_user_count;
    return this;
  }
  private Long new_order_user_count;
  public Long get_new_order_user_count() {
    return new_order_user_count;
  }
  public void set_new_order_user_count(Long new_order_user_count) {
    this.new_order_user_count = new_order_user_count;
  }
  public ads_user_total with_new_order_user_count(Long new_order_user_count) {
    this.new_order_user_count = new_order_user_count;
    return this;
  }
  private java.math.BigDecimal order_final_amount;
  public java.math.BigDecimal get_order_final_amount() {
    return order_final_amount;
  }
  public void set_order_final_amount(java.math.BigDecimal order_final_amount) {
    this.order_final_amount = order_final_amount;
  }
  public ads_user_total with_order_final_amount(java.math.BigDecimal order_final_amount) {
    this.order_final_amount = order_final_amount;
    return this;
  }
  private Long order_user_count;
  public Long get_order_user_count() {
    return order_user_count;
  }
  public void set_order_user_count(Long order_user_count) {
    this.order_user_count = order_user_count;
  }
  public ads_user_total with_order_user_count(Long order_user_count) {
    this.order_user_count = order_user_count;
    return this;
  }
  private Long no_order_user_count;
  public Long get_no_order_user_count() {
    return no_order_user_count;
  }
  public void set_no_order_user_count(Long no_order_user_count) {
    this.no_order_user_count = no_order_user_count;
  }
  public ads_user_total with_no_order_user_count(Long no_order_user_count) {
    this.no_order_user_count = no_order_user_count;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_user_total)) {
      return false;
    }
    ads_user_total that = (ads_user_total) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.recent_days == null ? that.recent_days == null : this.recent_days.equals(that.recent_days));
    equal = equal && (this.new_user_count == null ? that.new_user_count == null : this.new_user_count.equals(that.new_user_count));
    equal = equal && (this.new_order_user_count == null ? that.new_order_user_count == null : this.new_order_user_count.equals(that.new_order_user_count));
    equal = equal && (this.order_final_amount == null ? that.order_final_amount == null : this.order_final_amount.equals(that.order_final_amount));
    equal = equal && (this.order_user_count == null ? that.order_user_count == null : this.order_user_count.equals(that.order_user_count));
    equal = equal && (this.no_order_user_count == null ? that.no_order_user_count == null : this.no_order_user_count.equals(that.no_order_user_count));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_user_total)) {
      return false;
    }
    ads_user_total that = (ads_user_total) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.recent_days == null ? that.recent_days == null : this.recent_days.equals(that.recent_days));
    equal = equal && (this.new_user_count == null ? that.new_user_count == null : this.new_user_count.equals(that.new_user_count));
    equal = equal && (this.new_order_user_count == null ? that.new_order_user_count == null : this.new_order_user_count.equals(that.new_order_user_count));
    equal = equal && (this.order_final_amount == null ? that.order_final_amount == null : this.order_final_amount.equals(that.order_final_amount));
    equal = equal && (this.order_user_count == null ? that.order_user_count == null : this.order_user_count.equals(that.order_user_count));
    equal = equal && (this.no_order_user_count == null ? that.no_order_user_count == null : this.no_order_user_count.equals(that.no_order_user_count));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.recent_days = JdbcWritableBridge.readLong(2, __dbResults);
    this.new_user_count = JdbcWritableBridge.readLong(3, __dbResults);
    this.new_order_user_count = JdbcWritableBridge.readLong(4, __dbResults);
    this.order_final_amount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.order_user_count = JdbcWritableBridge.readLong(6, __dbResults);
    this.no_order_user_count = JdbcWritableBridge.readLong(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.recent_days = JdbcWritableBridge.readLong(2, __dbResults);
    this.new_user_count = JdbcWritableBridge.readLong(3, __dbResults);
    this.new_order_user_count = JdbcWritableBridge.readLong(4, __dbResults);
    this.order_final_amount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.order_user_count = JdbcWritableBridge.readLong(6, __dbResults);
    this.no_order_user_count = JdbcWritableBridge.readLong(7, __dbResults);
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
    JdbcWritableBridge.writeLong(new_user_count, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(new_order_user_count, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_final_amount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(order_user_count, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(no_order_user_count, 7 + __off, -5, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeLong(recent_days, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(new_user_count, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(new_order_user_count, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_final_amount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(order_user_count, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(no_order_user_count, 7 + __off, -5, __dbStmt);
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
        this.new_user_count = null;
    } else {
    this.new_user_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.new_order_user_count = null;
    } else {
    this.new_order_user_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.order_final_amount = null;
    } else {
    this.order_final_amount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_user_count = null;
    } else {
    this.order_user_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.no_order_user_count = null;
    } else {
    this.no_order_user_count = Long.valueOf(__dataIn.readLong());
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
    if (null == this.new_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.new_user_count);
    }
    if (null == this.new_order_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.new_order_user_count);
    }
    if (null == this.order_final_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.order_final_amount, __dataOut);
    }
    if (null == this.order_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_user_count);
    }
    if (null == this.no_order_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.no_order_user_count);
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
    if (null == this.new_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.new_user_count);
    }
    if (null == this.new_order_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.new_order_user_count);
    }
    if (null == this.order_final_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.order_final_amount, __dataOut);
    }
    if (null == this.order_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_user_count);
    }
    if (null == this.no_order_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.no_order_user_count);
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
    __sb.append(FieldFormatter.escapeAndEnclose(new_user_count==null?"null":"" + new_user_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(new_order_user_count==null?"null":"" + new_order_user_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_final_amount==null?"null":order_final_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_user_count==null?"null":"" + order_user_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(no_order_user_count==null?"null":"" + no_order_user_count, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(new_user_count==null?"null":"" + new_user_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(new_order_user_count==null?"null":"" + new_order_user_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_final_amount==null?"null":order_final_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_user_count==null?"null":"" + order_user_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(no_order_user_count==null?"null":"" + no_order_user_count, delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.new_user_count = null; } else {
      this.new_user_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.new_order_user_count = null; } else {
      this.new_order_user_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_final_amount = null; } else {
      this.order_final_amount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_user_count = null; } else {
      this.order_user_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.no_order_user_count = null; } else {
      this.no_order_user_count = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.new_user_count = null; } else {
      this.new_user_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.new_order_user_count = null; } else {
      this.new_order_user_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_final_amount = null; } else {
      this.order_final_amount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_user_count = null; } else {
      this.order_user_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.no_order_user_count = null; } else {
      this.no_order_user_count = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_user_total o = (ads_user_total) super.clone();
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
    return o;
  }

  public void clone0(ads_user_total o) throws CloneNotSupportedException {
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("recent_days", this.recent_days);
    __sqoop$field_map.put("new_user_count", this.new_user_count);
    __sqoop$field_map.put("new_order_user_count", this.new_order_user_count);
    __sqoop$field_map.put("order_final_amount", this.order_final_amount);
    __sqoop$field_map.put("order_user_count", this.order_user_count);
    __sqoop$field_map.put("no_order_user_count", this.no_order_user_count);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("recent_days", this.recent_days);
    __sqoop$field_map.put("new_user_count", this.new_user_count);
    __sqoop$field_map.put("new_order_user_count", this.new_order_user_count);
    __sqoop$field_map.put("order_final_amount", this.order_final_amount);
    __sqoop$field_map.put("order_user_count", this.order_user_count);
    __sqoop$field_map.put("no_order_user_count", this.no_order_user_count);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("dt".equals(__fieldName)) {
      this.dt = (java.sql.Date) __fieldVal;
    }
    else    if ("recent_days".equals(__fieldName)) {
      this.recent_days = (Long) __fieldVal;
    }
    else    if ("new_user_count".equals(__fieldName)) {
      this.new_user_count = (Long) __fieldVal;
    }
    else    if ("new_order_user_count".equals(__fieldName)) {
      this.new_order_user_count = (Long) __fieldVal;
    }
    else    if ("order_final_amount".equals(__fieldName)) {
      this.order_final_amount = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("order_user_count".equals(__fieldName)) {
      this.order_user_count = (Long) __fieldVal;
    }
    else    if ("no_order_user_count".equals(__fieldName)) {
      this.no_order_user_count = (Long) __fieldVal;
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
    else    if ("new_user_count".equals(__fieldName)) {
      this.new_user_count = (Long) __fieldVal;
      return true;
    }
    else    if ("new_order_user_count".equals(__fieldName)) {
      this.new_order_user_count = (Long) __fieldVal;
      return true;
    }
    else    if ("order_final_amount".equals(__fieldName)) {
      this.order_final_amount = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("order_user_count".equals(__fieldName)) {
      this.order_user_count = (Long) __fieldVal;
      return true;
    }
    else    if ("no_order_user_count".equals(__fieldName)) {
      this.no_order_user_count = (Long) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
