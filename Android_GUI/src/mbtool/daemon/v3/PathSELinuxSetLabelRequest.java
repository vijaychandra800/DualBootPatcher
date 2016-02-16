// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PathSELinuxSetLabelRequest extends Table {
  public static PathSELinuxSetLabelRequest getRootAsPathSELinuxSetLabelRequest(ByteBuffer _bb) { return getRootAsPathSELinuxSetLabelRequest(_bb, new PathSELinuxSetLabelRequest()); }
  public static PathSELinuxSetLabelRequest getRootAsPathSELinuxSetLabelRequest(ByteBuffer _bb, PathSELinuxSetLabelRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public PathSELinuxSetLabelRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String path() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer pathAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String label() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer labelAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public boolean followSymlinks() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createPathSELinuxSetLabelRequest(FlatBufferBuilder builder,
      int pathOffset,
      int labelOffset,
      boolean follow_symlinks) {
    builder.startObject(3);
    PathSELinuxSetLabelRequest.addLabel(builder, labelOffset);
    PathSELinuxSetLabelRequest.addPath(builder, pathOffset);
    PathSELinuxSetLabelRequest.addFollowSymlinks(builder, follow_symlinks);
    return PathSELinuxSetLabelRequest.endPathSELinuxSetLabelRequest(builder);
  }

  public static void startPathSELinuxSetLabelRequest(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addPath(FlatBufferBuilder builder, int pathOffset) { builder.addOffset(0, pathOffset, 0); }
  public static void addLabel(FlatBufferBuilder builder, int labelOffset) { builder.addOffset(1, labelOffset, 0); }
  public static void addFollowSymlinks(FlatBufferBuilder builder, boolean followSymlinks) { builder.addBoolean(2, followSymlinks, false); }
  public static int endPathSELinuxSetLabelRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

