/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/DelEnvironmentBinaryFile.srv */

package ros.pkg.re_srvs.srv;

import java.nio.ByteBuffer;


public class DelEnvironmentBinaryFile extends ros.communication.Service<DelEnvironmentBinaryFile.Request, DelEnvironmentBinaryFile.Response> {

  public static java.lang.String __s_getDataType() { return "re_srvs/DelEnvironmentBinaryFile"; }
  public static java.lang.String __s_getMD5Sum() { return "92f0f09bf0f8863b94cf28ac651d722e"; }

  public java.lang.String getDataType() { return DelEnvironmentBinaryFile.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return DelEnvironmentBinaryFile.__s_getMD5Sum(); }

  public DelEnvironmentBinaryFile.Request createRequest() {
    return new DelEnvironmentBinaryFile.Request();
  }

  public DelEnvironmentBinaryFile.Response createResponse() {
    return new DelEnvironmentBinaryFile.Response();
  }

static public class Request extends ros.communication.Message {

  public java.lang.String envUID = new java.lang.String();
  public java.lang.String filename = new java.lang.String();
  public java.lang.String apiKey = new java.lang.String();

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/DelEnvironmentBinaryFileRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "1136d00233ab61df686c299299f780cd"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "92f0f09bf0f8863b94cf28ac651d722e"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string envUID\n" +
"string filename\n" +
"string apiKey\n" +
"\n" +
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
    __l += 4 + envUID.length();
    __l += 4 + filename.length();
    __l += 4 + apiKey.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, envUID);
    Serialization.writeString(bb, filename);
    Serialization.writeString(bb, apiKey);
  }

  public void deserialize(ByteBuffer bb) {
    envUID = Serialization.readString(bb);
    filename = Serialization.readString(bb);
    apiKey = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      envUID.equals(other.envUID) &&
      filename.equals(other.filename) &&
      apiKey.equals(other.apiKey) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.envUID == null ? 0 : this.envUID.hashCode());
    result = prime * result + (this.filename == null ? 0 : this.filename.hashCode());
    result = prime * result + (this.apiKey == null ? 0 : this.apiKey.hashCode());
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public boolean success;

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/DelEnvironmentBinaryFileResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "358e233cde0c8a8bcfea4ce193f8fc15"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "92f0f09bf0f8863b94cf28ac651d722e"; }
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
