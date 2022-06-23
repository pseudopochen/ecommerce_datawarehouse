// ORM class for table 'ads_coupon_stats'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 17 15:00:37 MDT 2022
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

public class ads_coupon_stats extends SqoopRecord  implements DBWritable, Writable {
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
  public ads_coupon_stats with_dt(java.sql.Date dt) {
    this.dt = dt;
    return this;
  }
  private String coupon_id;
  public String get_coupon_id() {
    return coupon_id;
  }
  public void set_coupon_id(String coupon_id) {
    this.coupon_id = coupon_id;
  }
  public ads_coupon_stats with_coupon_id(String coupon_id) {
    this.coupon_id = coupon_id;
    return this;
  }
  private String coupon_name;
  public String get_coupon_name() {
    return coupon_name;
  }
  public void set_coupon_name(String coupon_name) {
    this.coupon_name = coupon_name;
  }
  public ads_coupon_stats with_coupon_name(String coupon_name) {
    this.coupon_name = coupon_name;
    return this;
  }
  private java.sql.Date start_date;
  public java.sql.Date get_start_date() {
    return start_date;
  }
  public void set_start_date(java.sql.Date start_date) {
    this.start_date = start_date;
  }
  public ads_coupon_stats with_start_date(java.sql.Date start_date) {
    this.start_date = start_date;
    return this;
  }
  private String rule_name;
  public String get_rule_name() {
    return rule_name;
  }
  public void set_rule_name(String rule_name) {
    this.rule_name = rule_name;
  }
  public ads_coupon_stats with_rule_name(String rule_name) {
    this.rule_name = rule_name;
    return this;
  }
  private Long get_count;
  public Long get_get_count() {
    return get_count;
  }
  public void set_get_count(Long get_count) {
    this.get_count = get_count;
  }
  public ads_coupon_stats with_get_count(Long get_count) {
    this.get_count = get_count;
    return this;
  }
  private Long order_count;
  public Long get_order_count() {
    return order_count;
  }
  public void set_order_count(Long order_count) {
    this.order_count = order_count;
  }
  public ads_coupon_stats with_order_count(Long order_count) {
    this.order_count = order_count;
    return this;
  }
  private Long expire_count;
  public Long get_expire_count() {
    return expire_count;
  }
  public void set_expire_count(Long expire_count) {
    this.expire_count = expire_count;
  }
  public ads_coupon_stats with_expire_count(Long expire_count) {
    this.expire_count = expire_count;
    return this;
  }
  private java.math.BigDecimal order_original_amount;
  public java.math.BigDecimal get_order_original_amount() {
    return order_original_amount;
  }
  public void set_order_original_amount(java.math.BigDecimal order_original_amount) {
    this.order_original_amount = order_original_amount;
  }
  public ads_coupon_stats with_order_original_amount(java.math.BigDecimal order_original_amount) {
    this.order_original_amount = order_original_amount;
    return this;
  }
  private java.math.BigDecimal order_final_amount;
  public java.math.BigDecimal get_order_final_amount() {
    return order_final_amount;
  }
  public void set_order_final_amount(java.math.BigDecimal order_final_amount) {
    this.order_final_amount = order_final_amount;
  }
  public ads_coupon_stats with_order_final_amount(java.math.BigDecimal order_final_amount) {
    this.order_final_amount = order_final_amount;
    return this;
  }
  private java.math.BigDecimal reduce_amount;
  public java.math.BigDecimal get_reduce_amount() {
    return reduce_amount;
  }
  public void set_reduce_amount(java.math.BigDecimal reduce_amount) {
    this.reduce_amount = reduce_amount;
  }
  public ads_coupon_stats with_reduce_amount(java.math.BigDecimal reduce_amount) {
    this.reduce_amount = reduce_amount;
    return this;
  }
  private java.math.BigDecimal reduce_rate;
  public java.math.BigDecimal get_reduce_rate() {
    return reduce_rate;
  }
  public void set_reduce_rate(java.math.BigDecimal reduce_rate) {
    this.reduce_rate = reduce_rate;
  }
  public ads_coupon_stats with_reduce_rate(java.math.BigDecimal reduce_rate) {
    this.reduce_rate = reduce_rate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_coupon_stats)) {
      return false;
    }
    ads_coupon_stats that = (ads_coupon_stats) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.coupon_id == null ? that.coupon_id == null : this.coupon_id.equals(that.coupon_id));
    equal = equal && (this.coupon_name == null ? that.coupon_name == null : this.coupon_name.equals(that.coupon_name));
    equal = equal && (this.start_date == null ? that.start_date == null : this.start_date.equals(that.start_date));
    equal = equal && (this.rule_name == null ? that.rule_name == null : this.rule_name.equals(that.rule_name));
    equal = equal && (this.get_count == null ? that.get_count == null : this.get_count.equals(that.get_count));
    equal = equal && (this.order_count == null ? that.order_count == null : this.order_count.equals(that.order_count));
    equal = equal && (this.expire_count == null ? that.expire_count == null : this.expire_count.equals(that.expire_count));
    equal = equal && (this.order_original_amount == null ? that.order_original_amount == null : this.order_original_amount.equals(that.order_original_amount));
    equal = equal && (this.order_final_amount == null ? that.order_final_amount == null : this.order_final_amount.equals(that.order_final_amount));
    equal = equal && (this.reduce_amount == null ? that.reduce_amount == null : this.reduce_amount.equals(that.reduce_amount));
    equal = equal && (this.reduce_rate == null ? that.reduce_rate == null : this.reduce_rate.equals(that.reduce_rate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_coupon_stats)) {
      return false;
    }
    ads_coupon_stats that = (ads_coupon_stats) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.coupon_id == null ? that.coupon_id == null : this.coupon_id.equals(that.coupon_id));
    equal = equal && (this.coupon_name == null ? that.coupon_name == null : this.coupon_name.equals(that.coupon_name));
    equal = equal && (this.start_date == null ? that.start_date == null : this.start_date.equals(that.start_date));
    equal = equal && (this.rule_name == null ? that.rule_name == null : this.rule_name.equals(that.rule_name));
    equal = equal && (this.get_count == null ? that.get_count == null : this.get_count.equals(that.get_count));
    equal = equal && (this.order_count == null ? that.order_count == null : this.order_count.equals(that.order_count));
    equal = equal && (this.expire_count == null ? that.expire_count == null : this.expire_count.equals(that.expire_count));
    equal = equal && (this.order_original_amount == null ? that.order_original_amount == null : this.order_original_amount.equals(that.order_original_amount));
    equal = equal && (this.order_final_amount == null ? that.order_final_amount == null : this.order_final_amount.equals(that.order_final_amount));
    equal = equal && (this.reduce_amount == null ? that.reduce_amount == null : this.reduce_amount.equals(that.reduce_amount));
    equal = equal && (this.reduce_rate == null ? that.reduce_rate == null : this.reduce_rate.equals(that.reduce_rate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.coupon_id = JdbcWritableBridge.readString(2, __dbResults);
    this.coupon_name = JdbcWritableBridge.readString(3, __dbResults);
    this.start_date = JdbcWritableBridge.readDate(4, __dbResults);
    this.rule_name = JdbcWritableBridge.readString(5, __dbResults);
    this.get_count = JdbcWritableBridge.readLong(6, __dbResults);
    this.order_count = JdbcWritableBridge.readLong(7, __dbResults);
    this.expire_count = JdbcWritableBridge.readLong(8, __dbResults);
    this.order_original_amount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.order_final_amount = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.reduce_amount = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.reduce_rate = JdbcWritableBridge.readBigDecimal(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.coupon_id = JdbcWritableBridge.readString(2, __dbResults);
    this.coupon_name = JdbcWritableBridge.readString(3, __dbResults);
    this.start_date = JdbcWritableBridge.readDate(4, __dbResults);
    this.rule_name = JdbcWritableBridge.readString(5, __dbResults);
    this.get_count = JdbcWritableBridge.readLong(6, __dbResults);
    this.order_count = JdbcWritableBridge.readLong(7, __dbResults);
    this.expire_count = JdbcWritableBridge.readLong(8, __dbResults);
    this.order_original_amount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.order_final_amount = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.reduce_amount = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.reduce_rate = JdbcWritableBridge.readBigDecimal(12, __dbResults);
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
    JdbcWritableBridge.writeString(coupon_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(coupon_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(start_date, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(rule_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(get_count, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_count, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(expire_count, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_original_amount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_final_amount, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(reduce_amount, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(reduce_rate, 12 + __off, 3, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(coupon_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(coupon_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(start_date, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(rule_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(get_count, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_count, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(expire_count, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_original_amount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_final_amount, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(reduce_amount, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(reduce_rate, 12 + __off, 3, __dbStmt);
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
        this.coupon_id = null;
    } else {
    this.coupon_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.coupon_name = null;
    } else {
    this.coupon_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.start_date = null;
    } else {
    this.start_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.rule_name = null;
    } else {
    this.rule_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.get_count = null;
    } else {
    this.get_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.order_count = null;
    } else {
    this.order_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.expire_count = null;
    } else {
    this.expire_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.order_original_amount = null;
    } else {
    this.order_original_amount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_final_amount = null;
    } else {
    this.order_final_amount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reduce_amount = null;
    } else {
    this.reduce_amount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reduce_rate = null;
    } else {
    this.reduce_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dt.getTime());
    }
    if (null == this.coupon_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_id);
    }
    if (null == this.coupon_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_name);
    }
    if (null == this.start_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_date.getTime());
    }
    if (null == this.rule_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, rule_name);
    }
    if (null == this.get_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.get_count);
    }
    if (null == this.order_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_count);
    }
    if (null == this.expire_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_count);
    }
    if (null == this.order_original_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.order_original_amount, __dataOut);
    }
    if (null == this.order_final_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.order_final_amount, __dataOut);
    }
    if (null == this.reduce_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.reduce_amount, __dataOut);
    }
    if (null == this.reduce_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.reduce_rate, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dt.getTime());
    }
    if (null == this.coupon_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_id);
    }
    if (null == this.coupon_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_name);
    }
    if (null == this.start_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_date.getTime());
    }
    if (null == this.rule_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, rule_name);
    }
    if (null == this.get_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.get_count);
    }
    if (null == this.order_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_count);
    }
    if (null == this.expire_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_count);
    }
    if (null == this.order_original_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.order_original_amount, __dataOut);
    }
    if (null == this.order_final_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.order_final_amount, __dataOut);
    }
    if (null == this.reduce_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.reduce_amount, __dataOut);
    }
    if (null == this.reduce_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.reduce_rate, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_id==null?"null":coupon_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_name==null?"null":coupon_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_date==null?"null":"" + start_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rule_name==null?"null":rule_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(get_count==null?"null":"" + get_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_count==null?"null":"" + order_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_count==null?"null":"" + expire_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_original_amount==null?"null":order_original_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_final_amount==null?"null":order_final_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reduce_amount==null?"null":reduce_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reduce_rate==null?"null":reduce_rate.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(dt==null?"null":"" + dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_id==null?"null":coupon_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_name==null?"null":coupon_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_date==null?"null":"" + start_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rule_name==null?"null":rule_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(get_count==null?"null":"" + get_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_count==null?"null":"" + order_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_count==null?"null":"" + expire_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_original_amount==null?"null":order_original_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_final_amount==null?"null":order_final_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reduce_amount==null?"null":reduce_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reduce_rate==null?"null":reduce_rate.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.coupon_id = null; } else {
      this.coupon_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.coupon_name = null; } else {
      this.coupon_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.start_date = null; } else {
      this.start_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.rule_name = null; } else {
      this.rule_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.get_count = null; } else {
      this.get_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_count = null; } else {
      this.order_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.expire_count = null; } else {
      this.expire_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_original_amount = null; } else {
      this.order_original_amount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_final_amount = null; } else {
      this.order_final_amount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.reduce_amount = null; } else {
      this.reduce_amount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.reduce_rate = null; } else {
      this.reduce_rate = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.coupon_id = null; } else {
      this.coupon_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.coupon_name = null; } else {
      this.coupon_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.start_date = null; } else {
      this.start_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.rule_name = null; } else {
      this.rule_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.get_count = null; } else {
      this.get_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_count = null; } else {
      this.order_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.expire_count = null; } else {
      this.expire_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_original_amount = null; } else {
      this.order_original_amount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_final_amount = null; } else {
      this.order_final_amount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.reduce_amount = null; } else {
      this.reduce_amount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.reduce_rate = null; } else {
      this.reduce_rate = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_coupon_stats o = (ads_coupon_stats) super.clone();
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
    o.start_date = (o.start_date != null) ? (java.sql.Date) o.start_date.clone() : null;
    return o;
  }

  public void clone0(ads_coupon_stats o) throws CloneNotSupportedException {
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
    o.start_date = (o.start_date != null) ? (java.sql.Date) o.start_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("coupon_id", this.coupon_id);
    __sqoop$field_map.put("coupon_name", this.coupon_name);
    __sqoop$field_map.put("start_date", this.start_date);
    __sqoop$field_map.put("rule_name", this.rule_name);
    __sqoop$field_map.put("get_count", this.get_count);
    __sqoop$field_map.put("order_count", this.order_count);
    __sqoop$field_map.put("expire_count", this.expire_count);
    __sqoop$field_map.put("order_original_amount", this.order_original_amount);
    __sqoop$field_map.put("order_final_amount", this.order_final_amount);
    __sqoop$field_map.put("reduce_amount", this.reduce_amount);
    __sqoop$field_map.put("reduce_rate", this.reduce_rate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("coupon_id", this.coupon_id);
    __sqoop$field_map.put("coupon_name", this.coupon_name);
    __sqoop$field_map.put("start_date", this.start_date);
    __sqoop$field_map.put("rule_name", this.rule_name);
    __sqoop$field_map.put("get_count", this.get_count);
    __sqoop$field_map.put("order_count", this.order_count);
    __sqoop$field_map.put("expire_count", this.expire_count);
    __sqoop$field_map.put("order_original_amount", this.order_original_amount);
    __sqoop$field_map.put("order_final_amount", this.order_final_amount);
    __sqoop$field_map.put("reduce_amount", this.reduce_amount);
    __sqoop$field_map.put("reduce_rate", this.reduce_rate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("dt".equals(__fieldName)) {
      this.dt = (java.sql.Date) __fieldVal;
    }
    else    if ("coupon_id".equals(__fieldName)) {
      this.coupon_id = (String) __fieldVal;
    }
    else    if ("coupon_name".equals(__fieldName)) {
      this.coupon_name = (String) __fieldVal;
    }
    else    if ("start_date".equals(__fieldName)) {
      this.start_date = (java.sql.Date) __fieldVal;
    }
    else    if ("rule_name".equals(__fieldName)) {
      this.rule_name = (String) __fieldVal;
    }
    else    if ("get_count".equals(__fieldName)) {
      this.get_count = (Long) __fieldVal;
    }
    else    if ("order_count".equals(__fieldName)) {
      this.order_count = (Long) __fieldVal;
    }
    else    if ("expire_count".equals(__fieldName)) {
      this.expire_count = (Long) __fieldVal;
    }
    else    if ("order_original_amount".equals(__fieldName)) {
      this.order_original_amount = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("order_final_amount".equals(__fieldName)) {
      this.order_final_amount = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("reduce_amount".equals(__fieldName)) {
      this.reduce_amount = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("reduce_rate".equals(__fieldName)) {
      this.reduce_rate = (java.math.BigDecimal) __fieldVal;
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
    else    if ("coupon_id".equals(__fieldName)) {
      this.coupon_id = (String) __fieldVal;
      return true;
    }
    else    if ("coupon_name".equals(__fieldName)) {
      this.coupon_name = (String) __fieldVal;
      return true;
    }
    else    if ("start_date".equals(__fieldName)) {
      this.start_date = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("rule_name".equals(__fieldName)) {
      this.rule_name = (String) __fieldVal;
      return true;
    }
    else    if ("get_count".equals(__fieldName)) {
      this.get_count = (Long) __fieldVal;
      return true;
    }
    else    if ("order_count".equals(__fieldName)) {
      this.order_count = (Long) __fieldVal;
      return true;
    }
    else    if ("expire_count".equals(__fieldName)) {
      this.expire_count = (Long) __fieldVal;
      return true;
    }
    else    if ("order_original_amount".equals(__fieldName)) {
      this.order_original_amount = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("order_final_amount".equals(__fieldName)) {
      this.order_final_amount = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("reduce_amount".equals(__fieldName)) {
      this.reduce_amount = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("reduce_rate".equals(__fieldName)) {
      this.reduce_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
