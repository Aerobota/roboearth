# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 2.8

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list

# Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build

# Include any dependencies generated for this target.
include CMakeFiles/TestObjectDetector.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/TestObjectDetector.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/TestObjectDetector.dir/flags.make

CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: CMakeFiles/TestObjectDetector.dir/flags.make
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: ../src/TestObjectDetector.cpp
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: ../manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/stacks/bullet/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/geometry_msgs/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/sensor_msgs/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/roslang/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/roscpp/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/rosconsole/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/stacks/geometry/angles/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/rospy/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/rostest/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/roswtf/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/message_filters/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/stacks/geometry/tf/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/std_msgs/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/stacks/vision_opencv/opencv2/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/stacks/vision_opencv/cv_bridge/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/ros/core/rosbuild/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/share/roslib/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/stacks/pluginlib/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/stacks/image_common/image_transport/manifest.xml
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/stacks/geometry/tf/msg_gen/generated
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /opt/ros/fuerte/stacks/geometry/tf/srv_gen/generated
CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg_gen/generated
	$(CMAKE_COMMAND) -E cmake_progress_report /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -o CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o -c /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/TestObjectDetector.cpp

CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -E /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/TestObjectDetector.cpp > CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.i

CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -S /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/TestObjectDetector.cpp -o CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.s

CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o.requires:
.PHONY : CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o.requires

CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o.provides: CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o.requires
	$(MAKE) -f CMakeFiles/TestObjectDetector.dir/build.make CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o.provides.build
.PHONY : CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o.provides

CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o.provides.build: CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o

# Object files for target TestObjectDetector
TestObjectDetector_OBJECTS = \
"CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o"

# External object files for target TestObjectDetector
TestObjectDetector_EXTERNAL_OBJECTS =

../bin/TestObjectDetector: CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o
../bin/TestObjectDetector: ../lib/libObjectDetectorFunctions.so
../bin/TestObjectDetector: ../lib/libDVision.so
../bin/TestObjectDetector: ../lib/libDUtilsCV.so
../bin/TestObjectDetector: ../lib/libDUtils.so
../bin/TestObjectDetector: CMakeFiles/TestObjectDetector.dir/build.make
../bin/TestObjectDetector: CMakeFiles/TestObjectDetector.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable ../bin/TestObjectDetector"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/TestObjectDetector.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/TestObjectDetector.dir/build: ../bin/TestObjectDetector
.PHONY : CMakeFiles/TestObjectDetector.dir/build

CMakeFiles/TestObjectDetector.dir/requires: CMakeFiles/TestObjectDetector.dir/src/TestObjectDetector.o.requires
.PHONY : CMakeFiles/TestObjectDetector.dir/requires

CMakeFiles/TestObjectDetector.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/TestObjectDetector.dir/cmake_clean.cmake
.PHONY : CMakeFiles/TestObjectDetector.dir/clean

CMakeFiles/TestObjectDetector.dir/depend:
	cd /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build/CMakeFiles/TestObjectDetector.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/TestObjectDetector.dir/depend

