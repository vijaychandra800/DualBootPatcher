// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MbGetPackagesCountRequest extends Table {
  public static MbGetPackagesCountRequest getRootAsMbGetPackagesCountRequest(ByteBuffer _bb) { return getRootAsMbGetPackagesCountRequest(_bb, new MbGetPackagesCountRequest()); }
  public static MbGetPackagesCountRequest getRootAsMbGetPackagesCountRequest(ByteBuffer _bb, MbGetPackagesCountRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MbGetPackagesCountRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String romId() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer romIdAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }

  public static int createMbGetPackagesCountRequest(FlatBufferBuilder builder,
      int rom_idOffset) {
    builder.startObject(1);
    MbGetPackagesCountRequest.addRomId(builder, rom_idOffset);
    return MbGetPackagesCountRequest.endMbGetPackagesCountRequest(builder);
  }

  public static void startMbGetPackagesCountRequest(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addRomId(FlatBufferBuilder builder, int romIdOffset) { builder.addOffset(0, romIdOffset, 0); }
  public static int endMbGetPackagesCountRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

