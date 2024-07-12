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

@kotlin.jvm.JvmName("-initializerepositoryIndexRequest")
public inline fun repositoryIndexRequest(block: io.seldon.mlops.inference.v2.RepositoryIndexRequestKt.Dsl.() -> kotlin.Unit): io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexRequest =
  io.seldon.mlops.inference.v2.RepositoryIndexRequestKt.Dsl._create(io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexRequest.newBuilder()).apply { block() }._build()
public object RepositoryIndexRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexRequest = _builder.build()

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: string repository_name
     *&#64;&#64;
     *&#64;&#64;     The name of the repository. If empty the index is returned
     *&#64;&#64;     for all repositories.
     *&#64;&#64;
     * </pre>
     *
     * <code>string repository_name = 1;</code>
     */
    public var repositoryName: kotlin.String
      @JvmName("getRepositoryName")
      get() = _builder.getRepositoryName()
      @JvmName("setRepositoryName")
      set(value) {
        _builder.setRepositoryName(value)
      }
    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: string repository_name
     *&#64;&#64;
     *&#64;&#64;     The name of the repository. If empty the index is returned
     *&#64;&#64;     for all repositories.
     *&#64;&#64;
     * </pre>
     *
     * <code>string repository_name = 1;</code>
     */
    public fun clearRepositoryName() {
      _builder.clearRepositoryName()
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: bool ready
     *&#64;&#64;
     *&#64;&#64;     If true returned only models currently ready for inferencing.
     *&#64;&#64;
     * </pre>
     *
     * <code>bool ready = 2;</code>
     */
    public var ready: kotlin.Boolean
      @JvmName("getReady")
      get() = _builder.getReady()
      @JvmName("setReady")
      set(value) {
        _builder.setReady(value)
      }
    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: bool ready
     *&#64;&#64;
     *&#64;&#64;     If true returned only models currently ready for inferencing.
     *&#64;&#64;
     * </pre>
     *
     * <code>bool ready = 2;</code>
     */
    public fun clearReady() {
      _builder.clearReady()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexRequest.copy(block: io.seldon.mlops.inference.v2.RepositoryIndexRequestKt.Dsl.() -> kotlin.Unit): io.seldon.mlops.inference.v2.V2Dataplane.RepositoryIndexRequest =
  io.seldon.mlops.inference.v2.RepositoryIndexRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

