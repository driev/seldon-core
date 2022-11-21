/*
Copyright 2022 Seldon Technologies Ltd.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: v2_dataplane.proto

package io.seldon.mlops.inference.v2;

@kotlin.jvm.JvmSynthetic
public inline fun serverMetadataResponse(block: io.seldon.mlops.inference.v2.ServerMetadataResponseKt.Dsl.() -> kotlin.Unit): io.seldon.mlops.inference.v2.V2Dataplane.ServerMetadataResponse =
  io.seldon.mlops.inference.v2.ServerMetadataResponseKt.Dsl._create(io.seldon.mlops.inference.v2.V2Dataplane.ServerMetadataResponse.newBuilder()).apply { block() }._build()
public object ServerMetadataResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.seldon.mlops.inference.v2.V2Dataplane.ServerMetadataResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.seldon.mlops.inference.v2.V2Dataplane.ServerMetadataResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.seldon.mlops.inference.v2.V2Dataplane.ServerMetadataResponse = _builder.build()

    /**
     * <pre>
     * The server name.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <pre>
     * The server name.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <pre>
     * The server version.
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <pre>
     * The server version.
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ExtensionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     * @return A list containing the extensions.
     */
    public val extensions: com.google.protobuf.kotlin.DslList<kotlin.String, ExtensionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getExtensionsList()
      )
    /**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     * @param value The extensions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addExtensions")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ExtensionsProxy>.add(value: kotlin.String) {
      _builder.addExtensions(value)
    }
    /**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     * @param value The extensions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignExtensions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ExtensionsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     * @param values The extensions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllExtensions")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ExtensionsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllExtensions(values)
    }
    /**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     * @param values The extensions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllExtensions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ExtensionsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     * @param index The index to set the value at.
     * @param value The extensions to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setExtensions")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ExtensionsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setExtensions(index, value)
    }/**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearExtensions")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ExtensionsProxy>.clear() {
      _builder.clearExtensions()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun io.seldon.mlops.inference.v2.V2Dataplane.ServerMetadataResponse.copy(block: io.seldon.mlops.inference.v2.ServerMetadataResponseKt.Dsl.() -> kotlin.Unit): io.seldon.mlops.inference.v2.V2Dataplane.ServerMetadataResponse =
  io.seldon.mlops.inference.v2.ServerMetadataResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()