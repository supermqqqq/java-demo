// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.ejyi.demo.springboot.grpc.proto.hello;

public interface HelloRequest2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helloworld.HelloRequest2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 id = 2;</code>
   */
  int getId();

  /**
   * <code>.helloworld.HelloType HelloType = 3;</code>
   */
  int getHelloTypeValue();
  /**
   * <code>.helloworld.HelloType HelloType = 3;</code>
   */
  com.ejyi.demo.springboot.grpc.proto.hello.HelloType getHelloType();

  /**
   * <code>map&lt;string, string&gt; mapStr = 4;</code>
   */
  int getMapStrCount();
  /**
   * <code>map&lt;string, string&gt; mapStr = 4;</code>
   */
  boolean containsMapStr(
      java.lang.String key);
  /**
   * Use {@link #getMapStrMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMapStr();
  /**
   * <code>map&lt;string, string&gt; mapStr = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMapStrMap();
  /**
   * <code>map&lt;string, string&gt; mapStr = 4;</code>
   */

  java.lang.String getMapStrOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; mapStr = 4;</code>
   */

  java.lang.String getMapStrOrThrow(
      java.lang.String key);

  /**
   * <code>.helloworld.HelloRequest1 helloRequest1 = 5;</code>
   */
  boolean hasHelloRequest1();
  /**
   * <code>.helloworld.HelloRequest1 helloRequest1 = 5;</code>
   */
  com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 getHelloRequest1();
  /**
   * <code>.helloworld.HelloRequest1 helloRequest1 = 5;</code>
   */
  com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1OrBuilder getHelloRequest1OrBuilder();

  /**
   * <code>map&lt;string, .helloworld.HelloRequest1&gt; mapHelloRequest = 6;</code>
   */
  int getMapHelloRequestCount();
  /**
   * <code>map&lt;string, .helloworld.HelloRequest1&gt; mapHelloRequest = 6;</code>
   */
  boolean containsMapHelloRequest(
      java.lang.String key);
  /**
   * Use {@link #getMapHelloRequestMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1>
  getMapHelloRequest();
  /**
   * <code>map&lt;string, .helloworld.HelloRequest1&gt; mapHelloRequest = 6;</code>
   */
  java.util.Map<java.lang.String, com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1>
  getMapHelloRequestMap();
  /**
   * <code>map&lt;string, .helloworld.HelloRequest1&gt; mapHelloRequest = 6;</code>
   */

  com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 getMapHelloRequestOrDefault(
      java.lang.String key,
      com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 defaultValue);
  /**
   * <code>map&lt;string, .helloworld.HelloRequest1&gt; mapHelloRequest = 6;</code>
   */

  com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 getMapHelloRequestOrThrow(
      java.lang.String key);
}
