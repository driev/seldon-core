/*
Copyright (c) 2024 Seldon Technologies Ltd.

Use of this software is governed BY
(1) the license included in the LICENSE file or
(2) if the license included in the LICENSE file is the Business Source License 1.1,
the Change License after the Change Date as each is defined in accordance with the LICENSE file.
*/

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: v2_dataplane.proto

package io.seldon.mlops.inference.v2;

@kotlin.jvm.JvmName("-initializerepositoryIndexResponse")
public inline fun repositoryIndexResponse(block: io.seldon.mlops.inference.v2.RepositoryIndexResponseKt.Dsl.() -> kotlin.Unit): io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse =
  io.seldon.mlops.inference.v2.RepositoryIndexResponseKt.Dsl._create(io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.newBuilder()).apply { block() }._build()
public object RepositoryIndexResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ModelsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     *&#64;&#64;
     *&#64;&#64;  .. cpp:var:: ModelIndex models (repeated)
     *&#64;&#64;
     *&#64;&#64;     An index entry for each model.
     *&#64;&#64;
     * </pre>
     *
     * <code>repeated .inference.RepositoryIndexResponse.ModelIndex models = 1;</code>
     */
     public val models: com.google.protobuf.kotlin.DslList<io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex, ModelsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getModelsList()
      )
    /**
     * <pre>
     *&#64;&#64;
     *&#64;&#64;  .. cpp:var:: ModelIndex models (repeated)
     *&#64;&#64;
     *&#64;&#64;     An index entry for each model.
     *&#64;&#64;
     * </pre>
     *
     * <code>repeated .inference.RepositoryIndexResponse.ModelIndex models = 1;</code>
     * @param value The models to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addModels")
    public fun com.google.protobuf.kotlin.DslList<io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex, ModelsProxy>.add(value: io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex) {
      _builder.addModels(value)
    }
    /**
     * <pre>
     *&#64;&#64;
     *&#64;&#64;  .. cpp:var:: ModelIndex models (repeated)
     *&#64;&#64;
     *&#64;&#64;     An index entry for each model.
     *&#64;&#64;
     * </pre>
     *
     * <code>repeated .inference.RepositoryIndexResponse.ModelIndex models = 1;</code>
     * @param value The models to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignModels")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex, ModelsProxy>.plusAssign(value: io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex) {
      add(value)
    }
    /**
     * <pre>
     *&#64;&#64;
     *&#64;&#64;  .. cpp:var:: ModelIndex models (repeated)
     *&#64;&#64;
     *&#64;&#64;     An index entry for each model.
     *&#64;&#64;
     * </pre>
     *
     * <code>repeated .inference.RepositoryIndexResponse.ModelIndex models = 1;</code>
     * @param values The models to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllModels")
    public fun com.google.protobuf.kotlin.DslList<io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex, ModelsProxy>.addAll(values: kotlin.collections.Iterable<io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex>) {
      _builder.addAllModels(values)
    }
    /**
     * <pre>
     *&#64;&#64;
     *&#64;&#64;  .. cpp:var:: ModelIndex models (repeated)
     *&#64;&#64;
     *&#64;&#64;     An index entry for each model.
     *&#64;&#64;
     * </pre>
     *
     * <code>repeated .inference.RepositoryIndexResponse.ModelIndex models = 1;</code>
     * @param values The models to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllModels")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex, ModelsProxy>.plusAssign(values: kotlin.collections.Iterable<io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex>) {
      addAll(values)
    }
    /**
     * <pre>
     *&#64;&#64;
     *&#64;&#64;  .. cpp:var:: ModelIndex models (repeated)
     *&#64;&#64;
     *&#64;&#64;     An index entry for each model.
     *&#64;&#64;
     * </pre>
     *
     * <code>repeated .inference.RepositoryIndexResponse.ModelIndex models = 1;</code>
     * @param index The index to set the value at.
     * @param value The models to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setModels")
    public operator fun com.google.protobuf.kotlin.DslList<io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex, ModelsProxy>.set(index: kotlin.Int, value: io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex) {
      _builder.setModels(index, value)
    }
    /**
     * <pre>
     *&#64;&#64;
     *&#64;&#64;  .. cpp:var:: ModelIndex models (repeated)
     *&#64;&#64;
     *&#64;&#64;     An index entry for each model.
     *&#64;&#64;
     * </pre>
     *
     * <code>repeated .inference.RepositoryIndexResponse.ModelIndex models = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearModels")
    public fun com.google.protobuf.kotlin.DslList<io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex, ModelsProxy>.clear() {
      _builder.clearModels()
    }

  }
  @kotlin.jvm.JvmName("-initializemodelIndex")
  public inline fun modelIndex(block: io.seldon.mlops.inference.v2.RepositoryIndexResponseKt.ModelIndexKt.Dsl.() -> kotlin.Unit): io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex =
    io.seldon.mlops.inference.v2.RepositoryIndexResponseKt.ModelIndexKt.Dsl._create(io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex.newBuilder()).apply { block() }._build()
  public object ModelIndexKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex = _builder.build()

      /**
       * <pre>
       *&#64;&#64;
       *&#64;&#64;    .. cpp:var:: string name
       *&#64;&#64;
       *&#64;&#64;       The name of the model.
       *&#64;&#64;
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
       *&#64;&#64;
       *&#64;&#64;    .. cpp:var:: string name
       *&#64;&#64;
       *&#64;&#64;       The name of the model.
       *&#64;&#64;
       * </pre>
       *
       * <code>string name = 1;</code>
       */
      public fun clearName() {
        _builder.clearName()
      }

      /**
       * <pre>
       *&#64;&#64;    .. cpp:var:: string version
       *&#64;&#64;
       *&#64;&#64;       The version of the model.
       *&#64;&#64;
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
       *&#64;&#64;    .. cpp:var:: string version
       *&#64;&#64;
       *&#64;&#64;       The version of the model.
       *&#64;&#64;
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public fun clearVersion() {
        _builder.clearVersion()
      }

      /**
       * <pre>
       *&#64;&#64;
       *&#64;&#64;    .. cpp:var:: string state
       *&#64;&#64;
       *&#64;&#64;       The state of the model.
       *&#64;&#64;
       * </pre>
       *
       * <code>string state = 3;</code>
       */
      public var state: kotlin.String
        @JvmName("getState")
        get() = _builder.getState()
        @JvmName("setState")
        set(value) {
          _builder.setState(value)
        }
      /**
       * <pre>
       *&#64;&#64;
       *&#64;&#64;    .. cpp:var:: string state
       *&#64;&#64;
       *&#64;&#64;       The state of the model.
       *&#64;&#64;
       * </pre>
       *
       * <code>string state = 3;</code>
       */
      public fun clearState() {
        _builder.clearState()
      }

      /**
       * <pre>
       *&#64;&#64;
       *&#64;&#64;    .. cpp:var:: string reason
       *&#64;&#64;
       *&#64;&#64;       The reason, if any, that the model is in the given state.
       *&#64;&#64;
       * </pre>
       *
       * <code>string reason = 4;</code>
       */
      public var reason: kotlin.String
        @JvmName("getReason")
        get() = _builder.getReason()
        @JvmName("setReason")
        set(value) {
          _builder.setReason(value)
        }
      /**
       * <pre>
       *&#64;&#64;
       *&#64;&#64;    .. cpp:var:: string reason
       *&#64;&#64;
       *&#64;&#64;       The reason, if any, that the model is in the given state.
       *&#64;&#64;
       * </pre>
       *
       * <code>string reason = 4;</code>
       */
      public fun clearReason() {
        _builder.clearReason()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.copy(block: io.seldon.mlops.inference.v2.RepositoryIndexResponseKt.Dsl.() -> kotlin.Unit): io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse =
  io.seldon.mlops.inference.v2.RepositoryIndexResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex.copy(block: io.seldon.mlops.inference.v2.RepositoryIndexResponseKt.ModelIndexKt.Dsl.() -> kotlin.Unit): io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexResponse.ModelIndex =
  io.seldon.mlops.inference.v2.RepositoryIndexResponseKt.ModelIndexKt.Dsl._create(this.toBuilder()).apply { block() }._build()

