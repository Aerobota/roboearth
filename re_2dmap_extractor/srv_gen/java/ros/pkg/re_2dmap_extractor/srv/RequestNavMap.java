/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_2dmap_extractor/srv/RequestNavMap.srv */

package ros.pkg.re_2dmap_extractor.srv;

import java.nio.ByteBuffer;


public class RequestNavMap extends ros.communication.Service<RequestNavMap.Request, RequestNavMap.Response> {

  public static java.lang.String __s_getDataType() { return "re_2dmap_extractor/RequestNavMap"; }
  public static java.lang.String __s_getMD5Sum() { return "fc2ec8e525a85e5d84266ccaa7e6d291"; }

  public java.lang.String getDataType() { return RequestNavMap.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return RequestNavMap.__s_getMD5Sum(); }

  public RequestNavMap.Request createRequest() {
    return new RequestNavMap.Request();
  }

  public RequestNavMap.Response createResponse() {
    return new RequestNavMap.Response();
  }

static public class Request extends ros.communication.Message {

  public ros.pkg.re_msgs.msg.RosFile octoMap = new ros.pkg.re_msgs.msg.RosFile();
  public double minZ;
  public double maxZ;
  public java.lang.String targetMapName = new java.lang.String();

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "re_2dmap_extractor/RequestNavMapRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "df7cf7463d29461f790152865b4c43ae"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "fc2ec8e525a85e5d84266ccaa7e6d291"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "re_msgs/RosFile octoMap\n" +
"float64 minZ\n" +
"float64 maxZ\n" +
"string targetMapName\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: re_msgs/RosFile\n" +
"# This file representation is used to pass binary data to the RoboEarthDB.\n" +
"# As the endianess isn't stored, only files with a byte order mark (BOM) or\n" +
"# an implicitly specified endianess should be transferred.\n" +
"string name   # file name\n" +
"int8[] data   # binary data \n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Request clone() {
    Request c = new Request();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += octoMap.serializationLength();
    __l += 8; // minZ
    __l += 8; // maxZ
    __l += 4 + targetMapName.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    octoMap.serialize(bb, seq);
    bb.putDouble(minZ);
    bb.putDouble(maxZ);
    Serialization.writeString(bb, targetMapName);
  }

  public void deserialize(ByteBuffer bb) {
    octoMap.deserialize(bb);
    minZ = bb.getDouble();
    maxZ = bb.getDouble();
    targetMapName = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      octoMap.equals(other.octoMap) &&
      minZ == other.minZ &&
      maxZ == other.maxZ &&
      targetMapName.equals(other.targetMapName) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.octoMap == null ? 0 : this.octoMap.hashCode());
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.minZ)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.maxZ)) ^ (tmp >>> 32));
    result = prime * result + (this.targetMapName == null ? 0 : this.targetMapName.hashCode());
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public boolean success;
  public ros.pkg.re_msgs.msg.RosFile navMap = new ros.pkg.re_msgs.msg.RosFile();
  public ros.pkg.re_msgs.msg.RosFile navMeta = new ros.pkg.re_msgs.msg.RosFile();

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "re_2dmap_extractor/RequestNavMapResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "97a3d99ee22bddc01d1424d7c776cdf8"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "fc2ec8e525a85e5d84266ccaa7e6d291"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "bool success\n" +
"re_msgs/RosFile navMap\n" +
"re_msgs/RosFile navMeta\n" +
"\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: re_msgs/RosFile\n" +
"# This file representation is used to pass binary data to the RoboEarthDB.\n" +
"# As the endianess isn't stored, only files with a byte order mark (BOM) or\n" +
"# an implicitly specified endianess should be transferred.\n" +
"string name   # file name\n" +
"int8[] data   # binary data \n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Response clone() {
    Response c = new Response();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 1; // success
    __l += navMap.serializationLength();
    __l += navMeta.serializationLength();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.put((byte)(success ? 1 : 0));
    navMap.serialize(bb, seq);
    navMeta.serialize(bb, seq);
  }

  public void deserialize(ByteBuffer bb) {
    success = bb.get() != 0 ? true : false;
    navMap.deserialize(bb);
    navMeta.deserialize(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      success == other.success &&
      navMap.equals(other.navMap) &&
      navMeta.equals(other.navMeta) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.success ? 1231 : 1237);
    result = prime * result + (this.navMap == null ? 0 : this.navMap.hashCode());
    result = prime * result + (this.navMeta == null ? 0 : this.navMeta.hashCode());
    return result;
  }
} // class Response

} //class

