/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/SetEnvironment.srv */

package ros.pkg.re_srvs.srv;

import java.nio.ByteBuffer;


public class SetEnvironment extends ros.communication.Service<SetEnvironment.Request, SetEnvironment.Response> {

  public static java.lang.String __s_getDataType() { return "re_srvs/SetEnvironment"; }
  public static java.lang.String __s_getMD5Sum() { return "f22e7a1df0f0163b3238a8fccf24e141"; }

  public java.lang.String getDataType() { return SetEnvironment.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return SetEnvironment.__s_getMD5Sum(); }

  public SetEnvironment.Request createRequest() {
    return new SetEnvironment.Request();
  }

  public SetEnvironment.Response createResponse() {
    return new SetEnvironment.Response();
  }

static public class Request extends ros.communication.Message {

  public java.lang.String cls = new java.lang.String();
  public java.lang.String id = new java.lang.String();
  public java.lang.String description = new java.lang.String();
  public java.lang.String environment = new java.lang.String();
  public java.util.ArrayList<ros.pkg.re_msgs.msg.File> files = new java.util.ArrayList<ros.pkg.re_msgs.msg.File>();
  public java.lang.String apiKey = new java.lang.String();

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/SetEnvironmentRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "66bb6647d3636e904b1f631496fd9074"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "f22e7a1df0f0163b3238a8fccf24e141"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "\n" +
"string cls\n" +
"string id\n" +
"string description\n" +
"string environment\n" +
"re_msgs/File[] files\n" +
"\n" +
"string apiKey\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: re_msgs/File\n" +
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
    __l += 4 + cls.length();
    __l += 4 + id.length();
    __l += 4 + description.length();
    __l += 4 + environment.length();
    __l += 4;
    for(ros.pkg.re_msgs.msg.File val : files) {
      __l += val.serializationLength();
    }
    __l += 4 + apiKey.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, cls);
    Serialization.writeString(bb, id);
    Serialization.writeString(bb, description);
    Serialization.writeString(bb, environment);
    bb.putInt(files.size());
    for(ros.pkg.re_msgs.msg.File val : files) {
      val.serialize(bb, seq);
    }
    Serialization.writeString(bb, apiKey);
  }

  public void deserialize(ByteBuffer bb) {
    cls = Serialization.readString(bb);
    id = Serialization.readString(bb);
    description = Serialization.readString(bb);
    environment = Serialization.readString(bb);

    int __files_len = bb.getInt();
    files = new java.util.ArrayList<ros.pkg.re_msgs.msg.File>(__files_len);
    for(int __i=0; __i<__files_len; __i++) {
      ros.pkg.re_msgs.msg.File __tmp = new ros.pkg.re_msgs.msg.File();
      __tmp.deserialize(bb);
      files.add(__tmp);;
    }
    apiKey = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      cls.equals(other.cls) &&
      id.equals(other.id) &&
      description.equals(other.description) &&
      environment.equals(other.environment) &&
      files.equals(other.files) &&
      apiKey.equals(other.apiKey) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.cls == null ? 0 : this.cls.hashCode());
    result = prime * result + (this.id == null ? 0 : this.id.hashCode());
    result = prime * result + (this.description == null ? 0 : this.description.hashCode());
    result = prime * result + (this.environment == null ? 0 : this.environment.hashCode());
    result = prime * result + (this.files == null ? 0 : this.files.hashCode());
    result = prime * result + (this.apiKey == null ? 0 : this.apiKey.hashCode());
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public boolean success;

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/SetEnvironmentResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "358e233cde0c8a8bcfea4ce193f8fc15"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "f22e7a1df0f0163b3238a8fccf24e141"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "bool success\n" +
"\n" +
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
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.put((byte)(success ? 1 : 0));
  }

  public void deserialize(ByteBuffer bb) {
    success = bb.get() != 0 ? true : false;
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      success == other.success &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.success ? 1231 : 1237);
    return result;
  }
} // class Response

} //class

