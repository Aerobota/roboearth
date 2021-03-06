/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/srv/SearchFor.srv */
#ifndef RE_VISION_SERVICE_SEARCHFOR_H
#define RE_VISION_SERVICE_SEARCHFOR_H
#include <string>
#include <vector>
#include <map>
#include <ostream>
#include "ros/serialization.h"
#include "ros/builtin_message_traits.h"
#include "ros/message_operations.h"
#include "ros/time.h"

#include "ros/macros.h"

#include "ros/assert.h"

#include "ros/service_traits.h"

#include "std_msgs/Header.h"
#include "sensor_msgs/Image.h"


#include "re_msgs/DetectedObject.h"

namespace re_vision
{
template <class ContainerAllocator>
struct SearchForRequest_ {
  typedef SearchForRequest_<ContainerAllocator> Type;

  SearchForRequest_()
  : header()
  , Image()
  , Objects()
  , MaxPointsPerObject(0)
  {
  }

  SearchForRequest_(const ContainerAllocator& _alloc)
  : header(_alloc)
  , Image(_alloc)
  , Objects(_alloc)
  , MaxPointsPerObject(0)
  {
  }

  typedef  ::std_msgs::Header_<ContainerAllocator>  _header_type;
   ::std_msgs::Header_<ContainerAllocator>  header;

  typedef  ::sensor_msgs::Image_<ContainerAllocator>  _Image_type;
   ::sensor_msgs::Image_<ContainerAllocator>  Image;

  typedef std::vector<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > , typename ContainerAllocator::template rebind<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::other >  _Objects_type;
  std::vector<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > , typename ContainerAllocator::template rebind<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::other >  Objects;

  typedef int32_t _MaxPointsPerObject_type;
  int32_t MaxPointsPerObject;


  typedef boost::shared_ptr< ::re_vision::SearchForRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_vision::SearchForRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct SearchForRequest
typedef  ::re_vision::SearchForRequest_<std::allocator<void> > SearchForRequest;

typedef boost::shared_ptr< ::re_vision::SearchForRequest> SearchForRequestPtr;
typedef boost::shared_ptr< ::re_vision::SearchForRequest const> SearchForRequestConstPtr;


template <class ContainerAllocator>
struct SearchForResponse_ {
  typedef SearchForResponse_<ContainerAllocator> Type;

  SearchForResponse_()
  : Detections()
  {
  }

  SearchForResponse_(const ContainerAllocator& _alloc)
  : Detections(_alloc)
  {
  }

  typedef std::vector< ::re_msgs::DetectedObject_<ContainerAllocator> , typename ContainerAllocator::template rebind< ::re_msgs::DetectedObject_<ContainerAllocator> >::other >  _Detections_type;
  std::vector< ::re_msgs::DetectedObject_<ContainerAllocator> , typename ContainerAllocator::template rebind< ::re_msgs::DetectedObject_<ContainerAllocator> >::other >  Detections;


  typedef boost::shared_ptr< ::re_vision::SearchForResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_vision::SearchForResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct SearchForResponse
typedef  ::re_vision::SearchForResponse_<std::allocator<void> > SearchForResponse;

typedef boost::shared_ptr< ::re_vision::SearchForResponse> SearchForResponsePtr;
typedef boost::shared_ptr< ::re_vision::SearchForResponse const> SearchForResponseConstPtr;

struct SearchFor
{

typedef SearchForRequest Request;
typedef SearchForResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct SearchFor
} // namespace re_vision

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_vision::SearchForRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_vision::SearchForRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_vision::SearchForRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "d580d8a9a163fc1ccacaa074884f44fa";
  }

  static const char* value(const  ::re_vision::SearchForRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0xd580d8a9a163fc1cULL;
  static const uint64_t static_value2 = 0xcacaa074884f44faULL;
};

template<class ContainerAllocator>
struct DataType< ::re_vision::SearchForRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_vision/SearchForRequest";
  }

  static const char* value(const  ::re_vision::SearchForRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_vision::SearchForRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "Header header\n\
sensor_msgs/Image Image\n\
string[] Objects\n\
int32 MaxPointsPerObject\n\
\n\
================================================================================\n\
MSG: std_msgs/Header\n\
# Standard metadata for higher-level stamped data types.\n\
# This is generally used to communicate timestamped data \n\
# in a particular coordinate frame.\n\
# \n\
# sequence ID: consecutively increasing ID \n\
uint32 seq\n\
#Two-integer timestamp that is expressed as:\n\
# * stamp.secs: seconds (stamp_secs) since epoch\n\
# * stamp.nsecs: nanoseconds since stamp_secs\n\
# time-handling sugar is provided by the client library\n\
time stamp\n\
#Frame this data is associated with\n\
# 0: no frame\n\
# 1: global frame\n\
string frame_id\n\
\n\
================================================================================\n\
MSG: sensor_msgs/Image\n\
# This message contains an uncompressed image\n\
# (0, 0) is at top-left corner of image\n\
#\n\
\n\
Header header        # Header timestamp should be acquisition time of image\n\
                     # Header frame_id should be optical frame of camera\n\
                     # origin of frame should be optical center of cameara\n\
                     # +x should point to the right in the image\n\
                     # +y should point down in the image\n\
                     # +z should point into to plane of the image\n\
                     # If the frame_id here and the frame_id of the CameraInfo\n\
                     # message associated with the image conflict\n\
                     # the behavior is undefined\n\
\n\
uint32 height         # image height, that is, number of rows\n\
uint32 width          # image width, that is, number of columns\n\
\n\
# The legal values for encoding are in file src/image_encodings.cpp\n\
# If you want to standardize a new string format, join\n\
# ros-users@lists.sourceforge.net and send an email proposing a new encoding.\n\
\n\
string encoding       # Encoding of pixels -- channel meaning, ordering, size\n\
                      # taken from the list of strings in src/image_encodings.cpp\n\
\n\
uint8 is_bigendian    # is this data bigendian?\n\
uint32 step           # Full row length in bytes\n\
uint8[] data          # actual matrix data, size is (step * rows)\n\
\n\
";
  }

  static const char* value(const  ::re_vision::SearchForRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator> struct HasHeader< ::re_vision::SearchForRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct HasHeader< const ::re_vision::SearchForRequest_<ContainerAllocator> > : public TrueType {};
} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_vision::SearchForResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_vision::SearchForResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_vision::SearchForResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "aeec124a9861d0de2b52c994f7e655a9";
  }

  static const char* value(const  ::re_vision::SearchForResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0xaeec124a9861d0deULL;
  static const uint64_t static_value2 = 0x2b52c994f7e655a9ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_vision::SearchForResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_vision/SearchForResponse";
  }

  static const char* value(const  ::re_vision::SearchForResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_vision::SearchForResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_msgs/DetectedObject[] Detections\n\
\n\
\n\
\n\
================================================================================\n\
MSG: re_msgs/DetectedObject\n\
# Information of object detected in an image by re_vision\n\
#\n\
\n\
# detected points in the image\n\
Pixel[] points2d\n\
# detected 3d points in the camera reference\n\
geometry_msgs/Point[] points3d\n\
# pose of the object in the camera reference\n\
geometry_msgs/Pose pose\n\
# detected 3d points in the model reference\n\
geometry_msgs/Point[] points3d_model\n\
# detected 3d points octave\n\
int32[] octave\n\
\n\
================================================================================\n\
MSG: re_msgs/Pixel\n\
# top-left corner: (0,0)\n\
\n\
int32 x\n\
int32 y\n\
================================================================================\n\
MSG: geometry_msgs/Point\n\
# This contains the position of a point in free space\n\
float64 x\n\
float64 y\n\
float64 z\n\
\n\
================================================================================\n\
MSG: geometry_msgs/Pose\n\
# A representation of pose in free space, composed of postion and orientation. \n\
Point position\n\
Quaternion orientation\n\
\n\
================================================================================\n\
MSG: geometry_msgs/Quaternion\n\
# This represents an orientation in free space in quaternion form.\n\
\n\
float64 x\n\
float64 y\n\
float64 z\n\
float64 w\n\
\n\
";
  }

  static const char* value(const  ::re_vision::SearchForResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_vision::SearchForRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.header);
    stream.next(m.Image);
    stream.next(m.Objects);
    stream.next(m.MaxPointsPerObject);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct SearchForRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_vision::SearchForResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.Detections);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct SearchForResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<re_vision::SearchFor> {
  static const char* value() 
  {
    return "1750b3eb6ab327ff73f77a82f3fd6f57";
  }

  static const char* value(const re_vision::SearchFor&) { return value(); } 
};

template<>
struct DataType<re_vision::SearchFor> {
  static const char* value() 
  {
    return "re_vision/SearchFor";
  }

  static const char* value(const re_vision::SearchFor&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_vision::SearchForRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "1750b3eb6ab327ff73f77a82f3fd6f57";
  }

  static const char* value(const re_vision::SearchForRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_vision::SearchForRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_vision/SearchFor";
  }

  static const char* value(const re_vision::SearchForRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_vision::SearchForResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "1750b3eb6ab327ff73f77a82f3fd6f57";
  }

  static const char* value(const re_vision::SearchForResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_vision::SearchForResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_vision/SearchFor";
  }

  static const char* value(const re_vision::SearchForResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // RE_VISION_SERVICE_SEARCHFOR_H

