// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: platform_inside.proto

package com.blemobi.sep.probuf;

public final class PlatformApiProtos {
  private PlatformApiProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025platform_inside.proto\022\007bbproto\032\023common" +
      "_inside.proto\032\016platform.proto2S\n\tIPlatfo" +
      "rm\022F\n\026WriteAccountOperateLog\022\033.bbproto.P" +
      "AccountOperateLog\032\017.bbproto.PEmptyB+\n\026co" +
      "m.blemobi.sep.probufB\021PlatformApiProtosb" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.blemobi.sep.probuf.CommonApiProtos.getDescriptor(),
          com.blemobi.sep.probuf.PlatformProtos.getDescriptor(),
        }, assigner);
    com.blemobi.sep.probuf.CommonApiProtos.getDescriptor();
    com.blemobi.sep.probuf.PlatformProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
