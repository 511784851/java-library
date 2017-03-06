// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: edge.proto

package com.blemobi.sep.probuf;

public final class EdgeProtos {
  private EdgeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PEdgeVersionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:bbproto.PEdgeVersion)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool ForceUpdate = 1;</code>
     *
     * <pre>
     * 是否强制更新的标志位
     * </pre>
     */
    boolean getForceUpdate();

    /**
     * <code>optional bool RecommendUpdate = 2;</code>
     *
     * <pre>
     * 是否推荐更新的标志位
     * </pre>
     */
    boolean getRecommendUpdate();

    /**
     * <code>optional bool UpdateInAppStore = 3;</code>
     *
     * <pre>
     * 是否通过应用商店更新的标志位
     * </pre>
     */
    boolean getUpdateInAppStore();

    /**
     * <code>optional string LatestVersion = 4;</code>
     *
     * <pre>
     * 最新的版本号
     * </pre>
     */
    java.lang.String getLatestVersion();
    /**
     * <code>optional string LatestVersion = 4;</code>
     *
     * <pre>
     * 最新的版本号
     * </pre>
     */
    com.google.protobuf.ByteString
        getLatestVersionBytes();

    /**
     * <code>optional string UpdateLink = 5;</code>
     *
     * <pre>
     * 更新地址；UpdateInAppStore为true，就跳转到商店的下载页面；false时为apk下载地址
     * </pre>
     */
    java.lang.String getUpdateLink();
    /**
     * <code>optional string UpdateLink = 5;</code>
     *
     * <pre>
     * 更新地址；UpdateInAppStore为true，就跳转到商店的下载页面；false时为apk下载地址
     * </pre>
     */
    com.google.protobuf.ByteString
        getUpdateLinkBytes();
  }
  /**
   * Protobuf type {@code bbproto.PEdgeVersion}
   */
  public  static final class PEdgeVersion extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:bbproto.PEdgeVersion)
      PEdgeVersionOrBuilder {
    // Use PEdgeVersion.newBuilder() to construct.
    private PEdgeVersion(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private PEdgeVersion() {
      forceUpdate_ = false;
      recommendUpdate_ = false;
      updateInAppStore_ = false;
      latestVersion_ = "";
      updateLink_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private PEdgeVersion(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              forceUpdate_ = input.readBool();
              break;
            }
            case 16: {

              recommendUpdate_ = input.readBool();
              break;
            }
            case 24: {

              updateInAppStore_ = input.readBool();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              latestVersion_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              updateLink_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.blemobi.sep.probuf.EdgeProtos.internal_static_bbproto_PEdgeVersion_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.blemobi.sep.probuf.EdgeProtos.internal_static_bbproto_PEdgeVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion.class, com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion.Builder.class);
    }

    public static final int FORCEUPDATE_FIELD_NUMBER = 1;
    private boolean forceUpdate_;
    /**
     * <code>optional bool ForceUpdate = 1;</code>
     *
     * <pre>
     * 是否强制更新的标志位
     * </pre>
     */
    public boolean getForceUpdate() {
      return forceUpdate_;
    }

    public static final int RECOMMENDUPDATE_FIELD_NUMBER = 2;
    private boolean recommendUpdate_;
    /**
     * <code>optional bool RecommendUpdate = 2;</code>
     *
     * <pre>
     * 是否推荐更新的标志位
     * </pre>
     */
    public boolean getRecommendUpdate() {
      return recommendUpdate_;
    }

    public static final int UPDATEINAPPSTORE_FIELD_NUMBER = 3;
    private boolean updateInAppStore_;
    /**
     * <code>optional bool UpdateInAppStore = 3;</code>
     *
     * <pre>
     * 是否通过应用商店更新的标志位
     * </pre>
     */
    public boolean getUpdateInAppStore() {
      return updateInAppStore_;
    }

    public static final int LATESTVERSION_FIELD_NUMBER = 4;
    private volatile java.lang.Object latestVersion_;
    /**
     * <code>optional string LatestVersion = 4;</code>
     *
     * <pre>
     * 最新的版本号
     * </pre>
     */
    public java.lang.String getLatestVersion() {
      java.lang.Object ref = latestVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        latestVersion_ = s;
        return s;
      }
    }
    /**
     * <code>optional string LatestVersion = 4;</code>
     *
     * <pre>
     * 最新的版本号
     * </pre>
     */
    public com.google.protobuf.ByteString
        getLatestVersionBytes() {
      java.lang.Object ref = latestVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        latestVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UPDATELINK_FIELD_NUMBER = 5;
    private volatile java.lang.Object updateLink_;
    /**
     * <code>optional string UpdateLink = 5;</code>
     *
     * <pre>
     * 更新地址；UpdateInAppStore为true，就跳转到商店的下载页面；false时为apk下载地址
     * </pre>
     */
    public java.lang.String getUpdateLink() {
      java.lang.Object ref = updateLink_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        updateLink_ = s;
        return s;
      }
    }
    /**
     * <code>optional string UpdateLink = 5;</code>
     *
     * <pre>
     * 更新地址；UpdateInAppStore为true，就跳转到商店的下载页面；false时为apk下载地址
     * </pre>
     */
    public com.google.protobuf.ByteString
        getUpdateLinkBytes() {
      java.lang.Object ref = updateLink_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        updateLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (forceUpdate_ != false) {
        output.writeBool(1, forceUpdate_);
      }
      if (recommendUpdate_ != false) {
        output.writeBool(2, recommendUpdate_);
      }
      if (updateInAppStore_ != false) {
        output.writeBool(3, updateInAppStore_);
      }
      if (!getLatestVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, latestVersion_);
      }
      if (!getUpdateLinkBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 5, updateLink_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (forceUpdate_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, forceUpdate_);
      }
      if (recommendUpdate_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, recommendUpdate_);
      }
      if (updateInAppStore_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, updateInAppStore_);
      }
      if (!getLatestVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(4, latestVersion_);
      }
      if (!getUpdateLinkBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(5, updateLink_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code bbproto.PEdgeVersion}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:bbproto.PEdgeVersion)
        com.blemobi.sep.probuf.EdgeProtos.PEdgeVersionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.blemobi.sep.probuf.EdgeProtos.internal_static_bbproto_PEdgeVersion_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.blemobi.sep.probuf.EdgeProtos.internal_static_bbproto_PEdgeVersion_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion.class, com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion.Builder.class);
      }

      // Construct using com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        forceUpdate_ = false;

        recommendUpdate_ = false;

        updateInAppStore_ = false;

        latestVersion_ = "";

        updateLink_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.blemobi.sep.probuf.EdgeProtos.internal_static_bbproto_PEdgeVersion_descriptor;
      }

      public com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion getDefaultInstanceForType() {
        return com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion.getDefaultInstance();
      }

      public com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion build() {
        com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion buildPartial() {
        com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion result = new com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion(this);
        result.forceUpdate_ = forceUpdate_;
        result.recommendUpdate_ = recommendUpdate_;
        result.updateInAppStore_ = updateInAppStore_;
        result.latestVersion_ = latestVersion_;
        result.updateLink_ = updateLink_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion) {
          return mergeFrom((com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion other) {
        if (other == com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion.getDefaultInstance()) return this;
        if (other.getForceUpdate() != false) {
          setForceUpdate(other.getForceUpdate());
        }
        if (other.getRecommendUpdate() != false) {
          setRecommendUpdate(other.getRecommendUpdate());
        }
        if (other.getUpdateInAppStore() != false) {
          setUpdateInAppStore(other.getUpdateInAppStore());
        }
        if (!other.getLatestVersion().isEmpty()) {
          latestVersion_ = other.latestVersion_;
          onChanged();
        }
        if (!other.getUpdateLink().isEmpty()) {
          updateLink_ = other.updateLink_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean forceUpdate_ ;
      /**
       * <code>optional bool ForceUpdate = 1;</code>
       *
       * <pre>
       * 是否强制更新的标志位
       * </pre>
       */
      public boolean getForceUpdate() {
        return forceUpdate_;
      }
      /**
       * <code>optional bool ForceUpdate = 1;</code>
       *
       * <pre>
       * 是否强制更新的标志位
       * </pre>
       */
      public Builder setForceUpdate(boolean value) {
        
        forceUpdate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool ForceUpdate = 1;</code>
       *
       * <pre>
       * 是否强制更新的标志位
       * </pre>
       */
      public Builder clearForceUpdate() {
        
        forceUpdate_ = false;
        onChanged();
        return this;
      }

      private boolean recommendUpdate_ ;
      /**
       * <code>optional bool RecommendUpdate = 2;</code>
       *
       * <pre>
       * 是否推荐更新的标志位
       * </pre>
       */
      public boolean getRecommendUpdate() {
        return recommendUpdate_;
      }
      /**
       * <code>optional bool RecommendUpdate = 2;</code>
       *
       * <pre>
       * 是否推荐更新的标志位
       * </pre>
       */
      public Builder setRecommendUpdate(boolean value) {
        
        recommendUpdate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool RecommendUpdate = 2;</code>
       *
       * <pre>
       * 是否推荐更新的标志位
       * </pre>
       */
      public Builder clearRecommendUpdate() {
        
        recommendUpdate_ = false;
        onChanged();
        return this;
      }

      private boolean updateInAppStore_ ;
      /**
       * <code>optional bool UpdateInAppStore = 3;</code>
       *
       * <pre>
       * 是否通过应用商店更新的标志位
       * </pre>
       */
      public boolean getUpdateInAppStore() {
        return updateInAppStore_;
      }
      /**
       * <code>optional bool UpdateInAppStore = 3;</code>
       *
       * <pre>
       * 是否通过应用商店更新的标志位
       * </pre>
       */
      public Builder setUpdateInAppStore(boolean value) {
        
        updateInAppStore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool UpdateInAppStore = 3;</code>
       *
       * <pre>
       * 是否通过应用商店更新的标志位
       * </pre>
       */
      public Builder clearUpdateInAppStore() {
        
        updateInAppStore_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object latestVersion_ = "";
      /**
       * <code>optional string LatestVersion = 4;</code>
       *
       * <pre>
       * 最新的版本号
       * </pre>
       */
      public java.lang.String getLatestVersion() {
        java.lang.Object ref = latestVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          latestVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string LatestVersion = 4;</code>
       *
       * <pre>
       * 最新的版本号
       * </pre>
       */
      public com.google.protobuf.ByteString
          getLatestVersionBytes() {
        java.lang.Object ref = latestVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          latestVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string LatestVersion = 4;</code>
       *
       * <pre>
       * 最新的版本号
       * </pre>
       */
      public Builder setLatestVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        latestVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string LatestVersion = 4;</code>
       *
       * <pre>
       * 最新的版本号
       * </pre>
       */
      public Builder clearLatestVersion() {
        
        latestVersion_ = getDefaultInstance().getLatestVersion();
        onChanged();
        return this;
      }
      /**
       * <code>optional string LatestVersion = 4;</code>
       *
       * <pre>
       * 最新的版本号
       * </pre>
       */
      public Builder setLatestVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        latestVersion_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object updateLink_ = "";
      /**
       * <code>optional string UpdateLink = 5;</code>
       *
       * <pre>
       * 更新地址；UpdateInAppStore为true，就跳转到商店的下载页面；false时为apk下载地址
       * </pre>
       */
      public java.lang.String getUpdateLink() {
        java.lang.Object ref = updateLink_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          updateLink_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string UpdateLink = 5;</code>
       *
       * <pre>
       * 更新地址；UpdateInAppStore为true，就跳转到商店的下载页面；false时为apk下载地址
       * </pre>
       */
      public com.google.protobuf.ByteString
          getUpdateLinkBytes() {
        java.lang.Object ref = updateLink_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          updateLink_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string UpdateLink = 5;</code>
       *
       * <pre>
       * 更新地址；UpdateInAppStore为true，就跳转到商店的下载页面；false时为apk下载地址
       * </pre>
       */
      public Builder setUpdateLink(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        updateLink_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string UpdateLink = 5;</code>
       *
       * <pre>
       * 更新地址；UpdateInAppStore为true，就跳转到商店的下载页面；false时为apk下载地址
       * </pre>
       */
      public Builder clearUpdateLink() {
        
        updateLink_ = getDefaultInstance().getUpdateLink();
        onChanged();
        return this;
      }
      /**
       * <code>optional string UpdateLink = 5;</code>
       *
       * <pre>
       * 更新地址；UpdateInAppStore为true，就跳转到商店的下载页面；false时为apk下载地址
       * </pre>
       */
      public Builder setUpdateLinkBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        updateLink_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:bbproto.PEdgeVersion)
    }

    // @@protoc_insertion_point(class_scope:bbproto.PEdgeVersion)
    private static final com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion();
    }

    public static com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PEdgeVersion>
        PARSER = new com.google.protobuf.AbstractParser<PEdgeVersion>() {
      public PEdgeVersion parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new PEdgeVersion(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<PEdgeVersion> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PEdgeVersion> getParserForType() {
      return PARSER;
    }

    public com.blemobi.sep.probuf.EdgeProtos.PEdgeVersion getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_bbproto_PEdgeVersion_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_bbproto_PEdgeVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nedge.proto\022\007bbproto\"\201\001\n\014PEdgeVersion\022\023" +
      "\n\013ForceUpdate\030\001 \001(\010\022\027\n\017RecommendUpdate\030\002" +
      " \001(\010\022\030\n\020UpdateInAppStore\030\003 \001(\010\022\025\n\rLatest" +
      "Version\030\004 \001(\t\022\022\n\nUpdateLink\030\005 \001(\tB$\n\026com" +
      ".blemobi.sep.probufB\nEdgeProtosb\006proto3"
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
        }, assigner);
    internal_static_bbproto_PEdgeVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bbproto_PEdgeVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_bbproto_PEdgeVersion_descriptor,
        new java.lang.String[] { "ForceUpdate", "RecommendUpdate", "UpdateInAppStore", "LatestVersion", "UpdateLink", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}