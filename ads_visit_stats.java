// ORM class for table 'ads_visit_stats'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 17 15:03:34 MDT 2022
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

public class ads_visit_stats extends SqoopRecord  implements DBWritable, Writable {
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
  public ads_visit_stats with_dt(java.sql.Date dt) {
    this.dt = dt;
    return this;
  }
  private String is_new;
  public String get_is_new() {
    return is_new;
  }
  public void set_is_new(String is_new) {
    this.is_new = is_new;
  }
  public ads_visit_stats with_is_new(String is_new) {
    this.is_new = is_new;
    return this;
  }
  private Integer recent_days;
  public Integer get_recent_days() {
    return recent_days;
  }
  public void set_recent_days(Integer recent_days) {
    this.recent_days = recent_days;
  }
  public ads_visit_stats with_recent_days(Integer recent_days) {
    this.recent_days = recent_days;
    return this;
  }
  private String channel;
  public String get_channel() {
    return channel;
  }
  public void set_channel(String channel) {
    this.channel = channel;
  }
  public ads_visit_stats with_channel(String channel) {
    this.channel = channel;
    return this;
  }
  private Long uv_count;
  public Long get_uv_count() {
    return uv_count;
  }
  public void set_uv_count(Long uv_count) {
    this.uv_count = uv_count;
  }
  public ads_visit_stats with_uv_count(Long uv_count) {
    this.uv_count = uv_count;
    return this;
  }
  private Long duration_sec;
  public Long get_duration_sec() {
    return duration_sec;
  }
  public void set_duration_sec(Long duration_sec) {
    this.duration_sec = duration_sec;
  }
  public ads_visit_stats with_duration_sec(Long duration_sec) {
    this.duration_sec = duration_sec;
    return this;
  }
  private Long avg_duration_sec;
  public Long get_avg_duration_sec() {
    return avg_duration_sec;
  }
  public void set_avg_duration_sec(Long avg_duration_sec) {
    this.avg_duration_sec = avg_duration_sec;
  }
  public ads_visit_stats with_avg_duration_sec(Long avg_duration_sec) {
    this.avg_duration_sec = avg_duration_sec;
    return this;
  }
  private Long page_count;
  public Long get_page_count() {
    return page_count;
  }
  public void set_page_count(Long page_count) {
    this.page_count = page_count;
  }
  public ads_visit_stats with_page_count(Long page_count) {
    this.page_count = page_count;
    return this;
  }
  private Long avg_page_count;
  public Long get_avg_page_count() {
    return avg_page_count;
  }
  public void set_avg_page_count(Long avg_page_count) {
    this.avg_page_count = avg_page_count;
  }
  public ads_visit_stats with_avg_page_count(Long avg_page_count) {
    this.avg_page_count = avg_page_count;
    return this;
  }
  private Long sv_count;
  public Long get_sv_count() {
    return sv_count;
  }
  public void set_sv_count(Long sv_count) {
    this.sv_count = sv_count;
  }
  public ads_visit_stats with_sv_count(Long sv_count) {
    this.sv_count = sv_count;
    return this;
  }
  private Long bounce_count;
  public Long get_bounce_count() {
    return bounce_count;
  }
  public void set_bounce_count(Long bounce_count) {
    this.bounce_count = bounce_count;
  }
  public ads_visit_stats with_bounce_count(Long bounce_count) {
    this.bounce_count = bounce_count;
    return this;
  }
  private java.math.BigDecimal bounce_rate;
  public java.math.BigDecimal get_bounce_rate() {
    return bounce_rate;
  }
  public void set_bounce_rate(java.math.BigDecimal bounce_rate) {
    this.bounce_rate = bounce_rate;
  }
  public ads_visit_stats with_bounce_rate(java.math.BigDecimal bounce_rate) {
    this.bounce_rate = bounce_rate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_visit_stats)) {
      return false;
    }
    ads_visit_stats that = (ads_visit_stats) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.is_new == null ? that.is_new == null : this.is_new.equals(that.is_new));
    equal = equal && (this.recent_days == null ? that.recent_days == null : this.recent_days.equals(that.recent_days));
    equal = equal && (this.channel == null ? that.channel == null : this.channel.equals(that.channel));
    equal = equal && (this.uv_count == null ? that.uv_count == null : this.uv_count.equals(that.uv_count));
    equal = equal && (this.duration_sec == null ? that.duration_sec == null : this.duration_sec.equals(that.duration_sec));
    equal = equal && (this.avg_duration_sec == null ? that.avg_duration_sec == null : this.avg_duration_sec.equals(that.avg_duration_sec));
    equal = equal && (this.page_count == null ? that.page_count == null : this.page_count.equals(that.page_count));
    equal = equal && (this.avg_page_count == null ? that.avg_page_count == null : this.avg_page_count.equals(that.avg_page_count));
    equal = equal && (this.sv_count == null ? that.sv_count == null : this.sv_count.equals(that.sv_count));
    equal = equal && (this.bounce_count == null ? that.bounce_count == null : this.bounce_count.equals(that.bounce_count));
    equal = equal && (this.bounce_rate == null ? that.bounce_rate == null : this.bounce_rate.equals(that.bounce_rate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_visit_stats)) {
      return false;
    }
    ads_visit_stats that = (ads_visit_stats) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.is_new == null ? that.is_new == null : this.is_new.equals(that.is_new));
    equal = equal && (this.recent_days == null ? that.recent_days == null : this.recent_days.equals(that.recent_days));
    equal = equal && (this.channel == null ? that.channel == null : this.channel.equals(that.channel));
    equal = equal && (this.uv_count == null ? that.uv_count == null : this.uv_count.equals(that.uv_count));
    equal = equal && (this.duration_sec == null ? that.duration_sec == null : this.duration_sec.equals(that.duration_sec));
    equal = equal && (this.avg_duration_sec == null ? that.avg_duration_sec == null : this.avg_duration_sec.equals(that.avg_duration_sec));
    equal = equal && (this.page_count == null ? that.page_count == null : this.page_count.equals(that.page_count));
    equal = equal && (this.avg_page_count == null ? that.avg_page_count == null : this.avg_page_count.equals(that.avg_page_count));
    equal = equal && (this.sv_count == null ? that.sv_count == null : this.sv_count.equals(that.sv_count));
    equal = equal && (this.bounce_count == null ? that.bounce_count == null : this.bounce_count.equals(that.bounce_count));
    equal = equal && (this.bounce_rate == null ? that.bounce_rate == null : this.bounce_rate.equals(that.bounce_rate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.is_new = JdbcWritableBridge.readString(2, __dbResults);
    this.recent_days = JdbcWritableBridge.readInteger(3, __dbResults);
    this.channel = JdbcWritableBridge.readString(4, __dbResults);
    this.uv_count = JdbcWritableBridge.readLong(5, __dbResults);
    this.duration_sec = JdbcWritableBridge.readLong(6, __dbResults);
    this.avg_duration_sec = JdbcWritableBridge.readLong(7, __dbResults);
    this.page_count = JdbcWritableBridge.readLong(8, __dbResults);
    this.avg_page_count = JdbcWritableBridge.readLong(9, __dbResults);
    this.sv_count = JdbcWritableBridge.readLong(10, __dbResults);
    this.bounce_count = JdbcWritableBridge.readLong(11, __dbResults);
    this.bounce_rate = JdbcWritableBridge.readBigDecimal(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.is_new = JdbcWritableBridge.readString(2, __dbResults);
    this.recent_days = JdbcWritableBridge.readInteger(3, __dbResults);
    this.channel = JdbcWritableBridge.readString(4, __dbResults);
    this.uv_count = JdbcWritableBridge.readLong(5, __dbResults);
    this.duration_sec = JdbcWritableBridge.readLong(6, __dbResults);
    this.avg_duration_sec = JdbcWritableBridge.readLong(7, __dbResults);
    this.page_count = JdbcWritableBridge.readLong(8, __dbResults);
    this.avg_page_count = JdbcWritableBridge.readLong(9, __dbResults);
    this.sv_count = JdbcWritableBridge.readLong(10, __dbResults);
    this.bounce_count = JdbcWritableBridge.readLong(11, __dbResults);
    this.bounce_rate = JdbcWritableBridge.readBigDecimal(12, __dbResults);
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
    JdbcWritableBridge.writeString(is_new, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(recent_days, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(channel, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(uv_count, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(duration_sec, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(avg_duration_sec, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(page_count, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(avg_page_count, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(sv_count, 10 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(bounce_count, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(bounce_rate, 12 + __off, 3, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(is_new, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(recent_days, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(channel, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(uv_count, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(duration_sec, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(avg_duration_sec, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(page_count, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(avg_page_count, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(sv_count, 10 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(bounce_count, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(bounce_rate, 12 + __off, 3, __dbStmt);
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
        this.is_new = null;
    } else {
    this.is_new = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.recent_days = null;
    } else {
    this.recent_days = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.channel = null;
    } else {
    this.channel = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.uv_count = null;
    } else {
    this.uv_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.duration_sec = null;
    } else {
    this.duration_sec = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.avg_duration_sec = null;
    } else {
    this.avg_duration_sec = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.page_count = null;
    } else {
    this.page_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.avg_page_count = null;
    } else {
    this.avg_page_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.sv_count = null;
    } else {
    this.sv_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.bounce_count = null;
    } else {
    this.bounce_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.bounce_rate = null;
    } else {
    this.bounce_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dt.getTime());
    }
    if (null == this.is_new) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, is_new);
    }
    if (null == this.recent_days) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recent_days);
    }
    if (null == this.channel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, channel);
    }
    if (null == this.uv_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.uv_count);
    }
    if (null == this.duration_sec) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.duration_sec);
    }
    if (null == this.avg_duration_sec) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.avg_duration_sec);
    }
    if (null == this.page_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.page_count);
    }
    if (null == this.avg_page_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.avg_page_count);
    }
    if (null == this.sv_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sv_count);
    }
    if (null == this.bounce_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.bounce_count);
    }
    if (null == this.bounce_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.bounce_rate, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dt.getTime());
    }
    if (null == this.is_new) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, is_new);
    }
    if (null == this.recent_days) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recent_days);
    }
    if (null == this.channel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, channel);
    }
    if (null == this.uv_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.uv_count);
    }
    if (null == this.duration_sec) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.duration_sec);
    }
    if (null == this.avg_duration_sec) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.avg_duration_sec);
    }
    if (null == this.page_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.page_count);
    }
    if (null == this.avg_page_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.avg_page_count);
    }
    if (null == this.sv_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sv_count);
    }
    if (null == this.bounce_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.bounce_count);
    }
    if (null == this.bounce_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.bounce_rate, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(is_new==null?"null":is_new, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recent_days==null?"null":"" + recent_days, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(channel==null?"null":channel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(uv_count==null?"null":"" + uv_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_sec==null?"null":"" + duration_sec, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_duration_sec==null?"null":"" + avg_duration_sec, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_count==null?"null":"" + page_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_page_count==null?"null":"" + avg_page_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sv_count==null?"null":"" + sv_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bounce_count==null?"null":"" + bounce_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bounce_rate==null?"null":bounce_rate.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(dt==null?"null":"" + dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_new==null?"null":is_new, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recent_days==null?"null":"" + recent_days, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(channel==null?"null":channel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(uv_count==null?"null":"" + uv_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_sec==null?"null":"" + duration_sec, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_duration_sec==null?"null":"" + avg_duration_sec, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_count==null?"null":"" + page_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_page_count==null?"null":"" + avg_page_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sv_count==null?"null":"" + sv_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bounce_count==null?"null":"" + bounce_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bounce_rate==null?"null":bounce_rate.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.is_new = null; } else {
      this.is_new = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.recent_days = null; } else {
      this.recent_days = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.channel = null; } else {
      this.channel = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.uv_count = null; } else {
      this.uv_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.duration_sec = null; } else {
      this.duration_sec = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.avg_duration_sec = null; } else {
      this.avg_duration_sec = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.page_count = null; } else {
      this.page_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.avg_page_count = null; } else {
      this.avg_page_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.sv_count = null; } else {
      this.sv_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.bounce_count = null; } else {
      this.bounce_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.bounce_rate = null; } else {
      this.bounce_rate = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.is_new = null; } else {
      this.is_new = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.recent_days = null; } else {
      this.recent_days = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.channel = null; } else {
      this.channel = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.uv_count = null; } else {
      this.uv_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.duration_sec = null; } else {
      this.duration_sec = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.avg_duration_sec = null; } else {
      this.avg_duration_sec = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.page_count = null; } else {
      this.page_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.avg_page_count = null; } else {
      this.avg_page_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.sv_count = null; } else {
      this.sv_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.bounce_count = null; } else {
      this.bounce_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.bounce_rate = null; } else {
      this.bounce_rate = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_visit_stats o = (ads_visit_stats) super.clone();
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
    return o;
  }

  public void clone0(ads_visit_stats o) throws CloneNotSupportedException {
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("is_new", this.is_new);
    __sqoop$field_map.put("recent_days", this.recent_days);
    __sqoop$field_map.put("channel", this.channel);
    __sqoop$field_map.put("uv_count", this.uv_count);
    __sqoop$field_map.put("duration_sec", this.duration_sec);
    __sqoop$field_map.put("avg_duration_sec", this.avg_duration_sec);
    __sqoop$field_map.put("page_count", this.page_count);
    __sqoop$field_map.put("avg_page_count", this.avg_page_count);
    __sqoop$field_map.put("sv_count", this.sv_count);
    __sqoop$field_map.put("bounce_count", this.bounce_count);
    __sqoop$field_map.put("bounce_rate", this.bounce_rate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("is_new", this.is_new);
    __sqoop$field_map.put("recent_days", this.recent_days);
    __sqoop$field_map.put("channel", this.channel);
    __sqoop$field_map.put("uv_count", this.uv_count);
    __sqoop$field_map.put("duration_sec", this.duration_sec);
    __sqoop$field_map.put("avg_duration_sec", this.avg_duration_sec);
    __sqoop$field_map.put("page_count", this.page_count);
    __sqoop$field_map.put("avg_page_count", this.avg_page_count);
    __sqoop$field_map.put("sv_count", this.sv_count);
    __sqoop$field_map.put("bounce_count", this.bounce_count);
    __sqoop$field_map.put("bounce_rate", this.bounce_rate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("dt".equals(__fieldName)) {
      this.dt = (java.sql.Date) __fieldVal;
    }
    else    if ("is_new".equals(__fieldName)) {
      this.is_new = (String) __fieldVal;
    }
    else    if ("recent_days".equals(__fieldName)) {
      this.recent_days = (Integer) __fieldVal;
    }
    else    if ("channel".equals(__fieldName)) {
      this.channel = (String) __fieldVal;
    }
    else    if ("uv_count".equals(__fieldName)) {
      this.uv_count = (Long) __fieldVal;
    }
    else    if ("duration_sec".equals(__fieldName)) {
      this.duration_sec = (Long) __fieldVal;
    }
    else    if ("avg_duration_sec".equals(__fieldName)) {
      this.avg_duration_sec = (Long) __fieldVal;
    }
    else    if ("page_count".equals(__fieldName)) {
      this.page_count = (Long) __fieldVal;
    }
    else    if ("avg_page_count".equals(__fieldName)) {
      this.avg_page_count = (Long) __fieldVal;
    }
    else    if ("sv_count".equals(__fieldName)) {
      this.sv_count = (Long) __fieldVal;
    }
    else    if ("bounce_count".equals(__fieldName)) {
      this.bounce_count = (Long) __fieldVal;
    }
    else    if ("bounce_rate".equals(__fieldName)) {
      this.bounce_rate = (java.math.BigDecimal) __fieldVal;
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
    else    if ("is_new".equals(__fieldName)) {
      this.is_new = (String) __fieldVal;
      return true;
    }
    else    if ("recent_days".equals(__fieldName)) {
      this.recent_days = (Integer) __fieldVal;
      return true;
    }
    else    if ("channel".equals(__fieldName)) {
      this.channel = (String) __fieldVal;
      return true;
    }
    else    if ("uv_count".equals(__fieldName)) {
      this.uv_count = (Long) __fieldVal;
      return true;
    }
    else    if ("duration_sec".equals(__fieldName)) {
      this.duration_sec = (Long) __fieldVal;
      return true;
    }
    else    if ("avg_duration_sec".equals(__fieldName)) {
      this.avg_duration_sec = (Long) __fieldVal;
      return true;
    }
    else    if ("page_count".equals(__fieldName)) {
      this.page_count = (Long) __fieldVal;
      return true;
    }
    else    if ("avg_page_count".equals(__fieldName)) {
      this.avg_page_count = (Long) __fieldVal;
      return true;
    }
    else    if ("sv_count".equals(__fieldName)) {
      this.sv_count = (Long) __fieldVal;
      return true;
    }
    else    if ("bounce_count".equals(__fieldName)) {
      this.bounce_count = (Long) __fieldVal;
      return true;
    }
    else    if ("bounce_rate".equals(__fieldName)) {
      this.bounce_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
