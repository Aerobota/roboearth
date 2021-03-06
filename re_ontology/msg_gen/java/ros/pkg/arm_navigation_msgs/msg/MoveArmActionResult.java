/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/stacks/arm_navigation/arm_navigation_msgs/msg/MoveArmActionResult.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class MoveArmActionResult extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public ros.pkg.actionlib_msgs.msg.GoalStatus status = new ros.pkg.actionlib_msgs.msg.GoalStatus();
  public ros.pkg.arm_navigation_msgs.msg.MoveArmResult result = new ros.pkg.arm_navigation_msgs.msg.MoveArmResult();

  public MoveArmActionResult() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/MoveArmActionResult"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "3e2bd2d3bd64d9942c0ef04de381c628"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n" +
"\n" +
"Header header\n" +
"actionlib_msgs/GoalStatus status\n" +
"MoveArmResult result\n" +
"\n" +
"================================================================================\n" +
"MSG: std_msgs/Header\n" +
"# Standard metadata for higher-level stamped data types.\n" +
"# This is generally used to communicate timestamped data \n" +
"# in a particular coordinate frame.\n" +
"# \n" +
"# sequence ID: consecutively increasing ID \n" +
"uint32 seq\n" +
"#Two-integer timestamp that is expressed as:\n" +
"# * stamp.secs: seconds (stamp_secs) since epoch\n" +
"# * stamp.nsecs: nanoseconds since stamp_secs\n" +
"# time-handling sugar is provided by the client library\n" +
"time stamp\n" +
"#Frame this data is associated with\n" +
"# 0: no frame\n" +
"# 1: global frame\n" +
"string frame_id\n" +
"\n" +
"================================================================================\n" +
"MSG: actionlib_msgs/GoalStatus\n" +
"GoalID goal_id\n" +
"uint8 status\n" +
"uint8 PENDING         = 0   # The goal has yet to be processed by the action server\n" +
"uint8 ACTIVE          = 1   # The goal is currently being processed by the action server\n" +
"uint8 PREEMPTED       = 2   # The goal received a cancel request after it started executing\n" +
"                            #   and has since completed its execution (Terminal State)\n" +
"uint8 SUCCEEDED       = 3   # The goal was achieved successfully by the action server (Terminal State)\n" +
"uint8 ABORTED         = 4   # The goal was aborted during execution by the action server due\n" +
"                            #    to some failure (Terminal State)\n" +
"uint8 REJECTED        = 5   # The goal was rejected by the action server without being processed,\n" +
"                            #    because the goal was unattainable or invalid (Terminal State)\n" +
"uint8 PREEMPTING      = 6   # The goal received a cancel request after it started executing\n" +
"                            #    and has not yet completed execution\n" +
"uint8 RECALLING       = 7   # The goal received a cancel request before it started executing,\n" +
"                            #    but the action server has not yet confirmed that the goal is canceled\n" +
"uint8 RECALLED        = 8   # The goal received a cancel request before it started executing\n" +
"                            #    and was successfully cancelled (Terminal State)\n" +
"uint8 LOST            = 9   # An action client can determine that a goal is LOST. This should not be\n" +
"                            #    sent over the wire by an action server\n" +
"\n" +
"#Allow for the user to associate a string with GoalStatus for debugging\n" +
"string text\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: actionlib_msgs/GoalID\n" +
"# The stamp should store the time at which this goal was requested.\n" +
"# It is used by an action server when it tries to preempt all\n" +
"# goals that were requested before a certain time\n" +
"time stamp\n" +
"\n" +
"# The id provides a way to associate feedback and\n" +
"# result message with specific goal requests. The id\n" +
"# specified must be unique.\n" +
"string id\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/MoveArmResult\n" +
"# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n" +
"# An error code reflecting what went wrong\n" +
"ArmNavigationErrorCodes error_code\n" +
"\n" +
"ContactInformation[] contacts\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/ArmNavigationErrorCodes\n" +
"int32 val\n" +
"\n" +
"# overall behavior\n" +
"int32 PLANNING_FAILED=-1\n" +
"int32 SUCCESS=1\n" +
"int32 TIMED_OUT=-2\n" +
"\n" +
"# start state errors\n" +
"int32 START_STATE_IN_COLLISION=-3\n" +
"int32 START_STATE_VIOLATES_PATH_CONSTRAINTS=-4\n" +
"\n" +
"# goal errors\n" +
"int32 GOAL_IN_COLLISION=-5\n" +
"int32 GOAL_VIOLATES_PATH_CONSTRAINTS=-6\n" +
"\n" +
"# robot state\n" +
"int32 INVALID_ROBOT_STATE=-7\n" +
"int32 INCOMPLETE_ROBOT_STATE=-8\n" +
"\n" +
"# planning request errors\n" +
"int32 INVALID_PLANNER_ID=-9\n" +
"int32 INVALID_NUM_PLANNING_ATTEMPTS=-10\n" +
"int32 INVALID_ALLOWED_PLANNING_TIME=-11\n" +
"int32 INVALID_GROUP_NAME=-12\n" +
"int32 INVALID_GOAL_JOINT_CONSTRAINTS=-13\n" +
"int32 INVALID_GOAL_POSITION_CONSTRAINTS=-14\n" +
"int32 INVALID_GOAL_ORIENTATION_CONSTRAINTS=-15\n" +
"int32 INVALID_PATH_JOINT_CONSTRAINTS=-16\n" +
"int32 INVALID_PATH_POSITION_CONSTRAINTS=-17\n" +
"int32 INVALID_PATH_ORIENTATION_CONSTRAINTS=-18\n" +
"\n" +
"# state/trajectory monitor errors\n" +
"int32 INVALID_TRAJECTORY=-19\n" +
"int32 INVALID_INDEX=-20\n" +
"int32 JOINT_LIMITS_VIOLATED=-21\n" +
"int32 PATH_CONSTRAINTS_VIOLATED=-22\n" +
"int32 COLLISION_CONSTRAINTS_VIOLATED=-23\n" +
"int32 GOAL_CONSTRAINTS_VIOLATED=-24\n" +
"int32 JOINTS_NOT_MOVING=-25\n" +
"int32 TRAJECTORY_CONTROLLER_FAILED=-26\n" +
"\n" +
"# system errors\n" +
"int32 FRAME_TRANSFORM_FAILURE=-27\n" +
"int32 COLLISION_CHECKING_UNAVAILABLE=-28\n" +
"int32 ROBOT_STATE_STALE=-29\n" +
"int32 SENSOR_INFO_STALE=-30\n" +
"\n" +
"# kinematics errors\n" +
"int32 NO_IK_SOLUTION=-31\n" +
"int32 INVALID_LINK_NAME=-32\n" +
"int32 IK_LINK_IN_COLLISION=-33\n" +
"int32 NO_FK_SOLUTION=-34\n" +
"int32 KINEMATICS_STATE_IN_COLLISION=-35\n" +
"\n" +
"# general errors\n" +
"int32 INVALID_TIMEOUT=-36\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/ContactInformation\n" +
"# Standard ROS header contains information \n" +
"# about the frame in which this \n" +
"# contact is specified\n" +
"Header header\n" +
"\n" +
"# Position of the contact point\n" +
"geometry_msgs/Point position\n" +
"\n" +
"# Normal corresponding to the contact point\n" +
"geometry_msgs/Vector3 normal \n" +
"\n" +
"# Depth of contact point\n" +
"float64 depth\n" +
"\n" +
"# Name of the first body that is in contact\n" +
"# This could be a link or a namespace that represents a body\n" +
"string contact_body_1\n" +
"string attached_body_1\n" +
"uint32 body_type_1\n" +
"\n" +
"# Name of the second body that is in contact\n" +
"# This could be a link or a namespace that represents a body\n" +
"string contact_body_2\n" +
"string attached_body_2\n" +
"uint32 body_type_2\n" +
"\n" +
"uint32 ROBOT_LINK=0\n" +
"uint32 OBJECT=1\n" +
"uint32 ATTACHED_BODY=2\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Vector3\n" +
"# This represents a vector in free space. \n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public MoveArmActionResult clone() {
    MoveArmActionResult c = new MoveArmActionResult();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += status.serializationLength();
    __l += result.serializationLength();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    status.serialize(bb, seq);
    result.serialize(bb, seq);
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    status.deserialize(bb);
    result.deserialize(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof MoveArmActionResult))
      return false;
    MoveArmActionResult other = (MoveArmActionResult) o;
    return
      header.equals(other.header) &&
      status.equals(other.status) &&
      result.equals(other.result) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.status == null ? 0 : this.status.hashCode());
    result = prime * result + (this.result == null ? 0 : this.result.hashCode());
    return result;
  }
} // class MoveArmActionResult

