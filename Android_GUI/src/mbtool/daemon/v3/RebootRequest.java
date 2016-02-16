// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class RebootRequest extends Table {
  public static RebootRequest getRootAsRebootRequest(ByteBuffer _bb) { return getRootAsRebootRequest(_bb, new RebootRequest()); }
  public static RebootRequest getRootAsRebootRequest(ByteBuffer _bb, RebootRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public RebootRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String arg() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer argAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public short type() { int o = __offset(6); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public boolean confirm() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createRebootRequest(FlatBufferBuilder builder,
      int argOffset,
      short type,
      boolean confirm) {
    builder.startObject(3);
    RebootRequest.addArg(builder, argOffset);
    RebootRequest.addType(builder, type);
    RebootRequest.addConfirm(builder, confirm);
    return RebootRequest.endRebootRequest(builder);
  }

  public static void startRebootRequest(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addArg(FlatBufferBuilder builder, int argOffset) { builder.addOffset(0, argOffset, 0); }
  public static void addType(FlatBufferBuilder builder, short type) { builder.addShort(1, type, 0); }
  public static void addConfirm(FlatBufferBuilder builder, boolean confirm) { builder.addBoolean(2, confirm, false); }
  public static int endRebootRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

