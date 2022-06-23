// ORM class for table 'ads_order_spu_stats'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 17 15:01:13 MDT 2022
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

public class ads_order_spu_stats extends SqoopRecord  implements DBWritable, Writable {
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
  public ads_order_spu_stats with_dt(java.sql.Date dt) {
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
  public ads_order_spu_stats with_recent_days(Long recent_days) {
    this.recent_days = recent_days;
    return this;
  }
  private String spu_id;
  public String get_spu_id() {
    return spu_id;
  }
  public void set_spu_id(String spu_id) {
    this.spu_id = spu_id;
  }
  public ads_order_spu_stats with_spu_id(String spu_id) {
    this.spu_id = spu_id;
    return this;
  }
  private String spu_name;
  public String get_spu_name() {
    return spu_name;
  }
  public void set_spu_name(String spu_name) {
    this.spu_name = spu_name;
  }
  public ads_order_spu_stats with_spu_name(String spu_name) {
    this.spu_name = spu_name;
    return this;
  }
  private String tm_id;
  public String get_tm_id() {
    return tm_id;
  }
  public void set_tm_id(String tm_id) {
    this.tm_id = tm_id;
  }
  public ads_order_spu_stats with_tm_id(String tm_id) {
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
  public ads_order_spu_stats with_tm_name(String tm_name) {
    this.tm_name = tm_name;
    return this;
  }
  private String category3_id;
  public String get_category3_id() {
    return category3_id;
  }
  public void set_category3_id(String category3_id) {
    this.category3_id = category3_id;
  }
  public ads_order_spu_stats with_category3_id(String category3_id) {
    this.category3_id = category3_id;
    return this;
  }
  private String category3_name;
  public String get_category3_name() {
    return category3_name;
  }
  public void set_category3_name(String category3_name) {
    this.category3_name = category3_name;
  }
  public ads_order_spu_stats with_category3_name(String category3_name) {
    this.category3_name = category3_name;
    return this;
  }
  private String category2_id;
  public String get_category2_id() {
    return category2_id;
  }
  public void set_category2_id(String category2_id) {
    this.category2_id = category2_id;
  }
  public ads_order_spu_stats with_category2_id(String category2_id) {
    this.category2_id = category2_id;
    return this;
  }
  private String category2_name;
  public String get_category2_name() {
    return category2_name;
  }
  public void set_category2_name(String category2_name) {
    this.category2_name = category2_name;
  }
  public ads_order_spu_stats with_category2_name(String category2_name) {
    this.category2_name = category2_name;
    return this;
  }
  private String category1_id;
  public String get_category1_id() {
    return category1_id;
  }
  public void set_category1_id(String category1_id) {
    this.category1_id = category1_id;
  }
  public ads_order_spu_stats with_category1_id(String category1_id) {
    this.category1_id = category1_id;
    return this;
  }
  private String category1_name;
  public String get_category1_name() {
    return category1_name;
  }
  public void set_category1_name(String category1_name) {
    this.category1_name = category1_name;
  }
  public ads_order_spu_stats with_category1_name(String category1_name) {
    this.category1_name = category1_name;
    return this;
  }
  private Long order_count;
  public Long get_order_count() {
    return order_count;
  }
  public void set_order_count(Long order_count) {
    this.order_count = order_count;
  }
  public ads_order_spu_stats with_order_count(Long order_count) {
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
  public ads_order_spu_stats with_order_amount(java.math.BigDecimal order_amount) {
    this.order_amount = order_amount;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_order_spu_stats)) {
      return false;
    }
    ads_order_spu_stats that = (ads_order_spu_stats) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.recent_days == null ? that.recent_days == null : this.recent_days.equals(that.recent_days));
    equal = equal && (this.spu_id == null ? that.spu_id == null : this.spu_id.equals(that.spu_id));
    equal = equal && (this.spu_name == null ? that.spu_name == null : this.spu_name.equals(that.spu_name));
    equal = equal && (this.tm_id == null ? that.tm_id == null : this.tm_id.equals(that.tm_id));
    equal = equal && (this.tm_name == null ? that.tm_name == null : this.tm_name.equals(that.tm_name));
    equal = equal && (this.category3_id == null ? that.category3_id == null : this.category3_id.equals(that.category3_id));
    equal = equal && (this.category3_name == null ? that.category3_name == null : this.category3_name.equals(that.category3_name));
    equal = equal && (this.category2_id == null ? that.category2_id == null : this.category2_id.equals(that.category2_id));
    equal = equal && (this.category2_name == null ? that.category2_name == null : this.category2_name.equals(that.category2_name));
    equal = equal && (this.category1_id == null ? that.category1_id == null : this.category1_id.equals(that.category1_id));
    equal = equal && (this.category1_name == null ? that.category1_name == null : this.category1_name.equals(that.category1_name));
    equal = equal && (this.order_count == null ? that.order_count == null : this.order_count.equals(that.order_count));
    equal = equal && (this.order_amount == null ? that.order_amount == null : this.order_amount.equals(that.order_amount));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_order_spu_stats)) {
      return false;
    }
    ads_order_spu_stats that = (ads_order_spu_stats) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.recent_days == null ? that.recent_days == null : this.recent_days.equals(that.recent_days));
    equal = equal && (this.spu_id == null ? that.spu_id == null : this.spu_id.equals(that.spu_id));
    equal = equal && (this.spu_name == null ? that.spu_name == null : this.spu_name.equals(that.spu_name));
    equal = equal && (this.tm_id == null ? that.tm_id == null : this.tm_id.equals(that.tm_id));
    equal = equal && (this.tm_name == null ? that.tm_name == null : this.tm_name.equals(that.tm_name));
    equal = equal && (this.category3_id == null ? that.category3_id == null : this.category3_id.equals(that.category3_id));
    equal = equal && (this.category3_name == null ? that.category3_name == null : this.category3_name.equals(that.category3_name));
    equal = equal && (this.category2_id == null ? that.category2_id == null : this.category2_id.equals(that.category2_id));
    equal = equal && (this.category2_name == null ? that.category2_name == null : this.category2_name.equals(that.category2_name));
    equal = equal && (this.category1_id == null ? that.category1_id == null : this.category1_id.equals(that.category1_id));
    equal = equal && (this.category1_name == null ? that.category1_name == null : this.category1_name.equals(that.category1_name));
    equal = equal && (this.order_count == null ? that.order_count == null : this.order_count.equals(that.order_count));
    equal = equal && (this.order_amount == null ? that.order_amount == null : this.order_amount.equals(that.order_amount));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.recent_days = JdbcWritableBridge.readLong(2, __dbResults);
    this.spu_id = JdbcWritableBridge.readString(3, __dbResults);
    this.spu_name = JdbcWritableBridge.readString(4, __dbResults);
    this.tm_id = JdbcWritableBridge.readString(5, __dbResults);
    this.tm_name = JdbcWritableBridge.readString(6, __dbResults);
    this.category3_id = JdbcWritableBridge.readString(7, __dbResults);
    this.category3_name = JdbcWritableBridge.readString(8, __dbResults);
    this.category2_id = JdbcWritableBridge.readString(9, __dbResults);
    this.category2_name = JdbcWritableBridge.readString(10, __dbResults);
    this.category1_id = JdbcWritableBridge.readString(11, __dbResults);
    this.category1_name = JdbcWritableBridge.readString(12, __dbResults);
    this.order_count = JdbcWritableBridge.readLong(13, __dbResults);
    this.order_amount = JdbcWritableBridge.readBigDecimal(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.recent_days = JdbcWritableBridge.readLong(2, __dbResults);
    this.spu_id = JdbcWritableBridge.readString(3, __dbResults);
    this.spu_name = JdbcWritableBridge.readString(4, __dbResults);
    this.tm_id = JdbcWritableBridge.readString(5, __dbResults);
    this.tm_name = JdbcWritableBridge.readString(6, __dbResults);
    this.category3_id = JdbcWritableBridge.readString(7, __dbResults);
    this.category3_name = JdbcWritableBridge.readString(8, __dbResults);
    this.category2_id = JdbcWritableBridge.readString(9, __dbResults);
    this.category2_name = JdbcWritableBridge.readString(10, __dbResults);
    this.category1_id = JdbcWritableBridge.readString(11, __dbResults);
    this.category1_name = JdbcWritableBridge.readString(12, __dbResults);
    this.order_count = JdbcWritableBridge.readLong(13, __dbResults);
    this.order_amount = JdbcWritableBridge.readBigDecimal(14, __dbResults);
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
    JdbcWritableBridge.writeString(spu_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(spu_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tm_id, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tm_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category3_id, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category3_name, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category2_id, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category2_name, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category1_id, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category1_name, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(order_count, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_amount, 14 + __off, 3, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeLong(recent_days, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(spu_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(spu_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tm_id, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tm_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category3_id, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category3_name, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category2_id, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category2_name, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category1_id, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category1_name, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(order_count, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(order_amount, 14 + __off, 3, __dbStmt);
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
        this.spu_id = null;
    } else {
    this.spu_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.spu_name = null;
    } else {
    this.spu_name = Text.readString(__dataIn);
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
        this.category3_id = null;
    } else {
    this.category3_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category3_name = null;
    } else {
    this.category3_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category2_id = null;
    } else {
    this.category2_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category2_name = null;
    } else {
    this.category2_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category1_id = null;
    } else {
    this.category1_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category1_name = null;
    } else {
    this.category1_name = Text.readString(__dataIn);
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
    if (null == this.spu_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, spu_id);
    }
    if (null == this.spu_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, spu_name);
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
    if (null == this.category3_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category3_id);
    }
    if (null == this.category3_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category3_name);
    }
    if (null == this.category2_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category2_id);
    }
    if (null == this.category2_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category2_name);
    }
    if (null == this.category1_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category1_id);
    }
    if (null == this.category1_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category1_name);
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
    if (null == this.spu_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, spu_id);
    }
    if (null == this.spu_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, spu_name);
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
    if (null == this.category3_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category3_id);
    }
    if (null == this.category3_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category3_name);
    }
    if (null == this.category2_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category2_id);
    }
    if (null == this.category2_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category2_name);
    }
    if (null == this.category1_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category1_id);
    }
    if (null == this.category1_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category1_name);
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
    __sb.append(FieldFormatter.escapeAndEnclose(spu_id==null?"null":spu_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(spu_name==null?"null":spu_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tm_id==null?"null":tm_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tm_name==null?"null":tm_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category3_id==null?"null":category3_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category3_name==null?"null":category3_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category2_id==null?"null":category2_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category2_name==null?"null":category2_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category1_id==null?"null":category1_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category1_name==null?"null":category1_name, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(spu_id==null?"null":spu_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(spu_name==null?"null":spu_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tm_id==null?"null":tm_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tm_name==null?"null":tm_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category3_id==null?"null":category3_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category3_name==null?"null":category3_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category2_id==null?"null":category2_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category2_name==null?"null":category2_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category1_id==null?"null":category1_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category1_name==null?"null":category1_name, delimiters));
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
    if (__cur_str.equals("\\N")) { this.spu_id = null; } else {
      this.spu_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.spu_name = null; } else {
      this.spu_name = __cur_str;
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
    if (__cur_str.equals("\\N")) { this.category3_id = null; } else {
      this.category3_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category3_name = null; } else {
      this.category3_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category2_id = null; } else {
      this.category2_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category2_name = null; } else {
      this.category2_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category1_id = null; } else {
      this.category1_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category1_name = null; } else {
      this.category1_name = __cur_str;
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
    if (__cur_str.equals("\\N")) { this.spu_id = null; } else {
      this.spu_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.spu_name = null; } else {
      this.spu_name = __cur_str;
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
    if (__cur_str.equals("\\N")) { this.category3_id = null; } else {
      this.category3_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category3_name = null; } else {
      this.category3_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category2_id = null; } else {
      this.category2_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category2_name = null; } else {
      this.category2_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category1_id = null; } else {
      this.category1_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category1_name = null; } else {
      this.category1_name = __cur_str;
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
    ads_order_spu_stats o = (ads_order_spu_stats) super.clone();
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
    return o;
  }

  public void clone0(ads_order_spu_stats o) throws CloneNotSupportedException {
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("recent_days", this.recent_days);
    __sqoop$field_map.put("spu_id", this.spu_id);
    __sqoop$field_map.put("spu_name", this.spu_name);
    __sqoop$field_map.put("tm_id", this.tm_id);
    __sqoop$field_map.put("tm_name", this.tm_name);
    __sqoop$field_map.put("category3_id", this.category3_id);
    __sqoop$field_map.put("category3_name", this.category3_name);
    __sqoop$field_map.put("category2_id", this.category2_id);
    __sqoop$field_map.put("category2_name", this.category2_name);
    __sqoop$field_map.put("category1_id", this.category1_id);
    __sqoop$field_map.put("category1_name", this.category1_name);
    __sqoop$field_map.put("order_count", this.order_count);
    __sqoop$field_map.put("order_amount", this.order_amount);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("recent_days", this.recent_days);
    __sqoop$field_map.put("spu_id", this.spu_id);
    __sqoop$field_map.put("spu_name", this.spu_name);
    __sqoop$field_map.put("tm_id", this.tm_id);
    __sqoop$field_map.put("tm_name", this.tm_name);
    __sqoop$field_map.put("category3_id", this.category3_id);
    __sqoop$field_map.put("category3_name", this.category3_name);
    __sqoop$field_map.put("category2_id", this.category2_id);
    __sqoop$field_map.put("category2_name", this.category2_name);
    __sqoop$field_map.put("category1_id", this.category1_id);
    __sqoop$field_map.put("category1_name", this.category1_name);
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
    else    if ("spu_id".equals(__fieldName)) {
      this.spu_id = (String) __fieldVal;
    }
    else    if ("spu_name".equals(__fieldName)) {
      this.spu_name = (String) __fieldVal;
    }
    else    if ("tm_id".equals(__fieldName)) {
      this.tm_id = (String) __fieldVal;
    }
    else    if ("tm_name".equals(__fieldName)) {
      this.tm_name = (String) __fieldVal;
    }
    else    if ("category3_id".equals(__fieldName)) {
      this.category3_id = (String) __fieldVal;
    }
    else    if ("category3_name".equals(__fieldName)) {
      this.category3_name = (String) __fieldVal;
    }
    else    if ("category2_id".equals(__fieldName)) {
      this.category2_id = (String) __fieldVal;
    }
    else    if ("category2_name".equals(__fieldName)) {
      this.category2_name = (String) __fieldVal;
    }
    else    if ("category1_id".equals(__fieldName)) {
      this.category1_id = (String) __fieldVal;
    }
    else    if ("category1_name".equals(__fieldName)) {
      this.category1_name = (String) __fieldVal;
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
    else    if ("spu_id".equals(__fieldName)) {
      this.spu_id = (String) __fieldVal;
      return true;
    }
    else    if ("spu_name".equals(__fieldName)) {
      this.spu_name = (String) __fieldVal;
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
    else    if ("category3_id".equals(__fieldName)) {
      this.category3_id = (String) __fieldVal;
      return true;
    }
    else    if ("category3_name".equals(__fieldName)) {
      this.category3_name = (String) __fieldVal;
      return true;
    }
    else    if ("category2_id".equals(__fieldName)) {
      this.category2_id = (String) __fieldVal;
      return true;
    }
    else    if ("category2_name".equals(__fieldName)) {
      this.category2_name = (String) __fieldVal;
      return true;
    }
    else    if ("category1_id".equals(__fieldName)) {
      this.category1_id = (String) __fieldVal;
      return true;
    }
    else    if ("category1_name".equals(__fieldName)) {
      this.category1_name = (String) __fieldVal;
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
