/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.interactions;

import static com.facebook.swift.service.SwiftConstants.STICKY_HASH_KEY;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.thrift.protocol.*;
import org.apache.thrift.ClientPushMetadata;
import org.apache.thrift.InteractionCreate;
import org.apache.thrift.InteractionTerminate;
import com.facebook.thrift.client.ResponseWrapper;
import com.facebook.thrift.client.RpcOptions;

public class MyServiceReactiveClient 
  implements MyService.Reactive {
  private static final AtomicLong _interactionCounter = new AtomicLong(0);

  private final org.apache.thrift.ProtocolId _protocolId;
  private final reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient;
  private final Map<String, String> _headers;
  private final Map<String, String> _persistentHeaders;
  private final Set<Long> _activeInteractions;

  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _foo_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _frobnicate_EXCEPTION_READERS_INT = new HashMap<>();
  private static final com.facebook.thrift.payload.Reader _frobnicate_EXCEPTION_READER_INT0 =
  oprot -> {
            try {
              test.fixtures.interactions.CustomException _r = test.fixtures.interactions.CustomException.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _ping_EXCEPTION_READERS_INT = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _truthify_EXCEPTION_READERS_INT = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _truthify_STREAM_EXCEPTION_READERS_INT = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _frobnicate_EXCEPTION_READERS_INT = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _ping_EXCEPTION_READERS_INT = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _truthify_EXCEPTION_READERS_INT = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _truthify_STREAM_EXCEPTION_READERS_INT = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _frobnicate_EXCEPTION_READERS_INT = java.util.Collections.emptyMap();

  static {
  }

  public MyServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient) {
    
    this._protocolId = _protocolId;
    this._rpcClient = _rpcClient;
    this._headers = java.util.Collections.emptyMap();
    this._persistentHeaders = java.util.Collections.emptyMap();
    this._activeInteractions = ConcurrentHashMap.newKeySet();
  }

  public MyServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(_protocolId, _rpcClient, _headers, _persistentHeaders, new AtomicLong(), ConcurrentHashMap.newKeySet());
  }

  public MyServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders, AtomicLong interactionCounter, Set<Long> activeInteractions) {
    
    this._protocolId = _protocolId;
    this._rpcClient = _rpcClient;
    this._headers = _headers;
    this._persistentHeaders = _persistentHeaders;
    this._activeInteractions = activeInteractions;
  }

  @java.lang.Override
  public void dispose() {}

  private com.facebook.thrift.payload.Writer _createfooWriter() {
    return oprot -> {
      try {

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _foo_READER =
    oprot -> {
              try {

                return null;

              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };


  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Void>> fooWrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("foo")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createfooWriter(),
                    _foo_READER,
                    _foo_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> foo( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return fooWrapper( rpcOptions).then();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> foo() {
    return foo( com.facebook.thrift.client.RpcOptions.EMPTY);
  }


  public class MyInteractionImpl implements MyInteraction {
    private final long interactionId;

    MyInteractionImpl(long interactionId) {
      this.interactionId = interactionId;
    }

    private final java.util.Map<Short, com.facebook.thrift.payload.Reader> _frobnicate_EXCEPTION_READERS = new HashMap<>();
    private final com.facebook.thrift.payload.Reader _frobnicate_EXCEPTION_READER_INT0 =
    oprot -> {
              try {
                test.fixtures.interactions.CustomException _r = test.fixtures.interactions.CustomException.read0(oprot);
                return _r;
              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };

    private final java.util.Map<Short, com.facebook.thrift.payload.Reader> _ping_EXCEPTION_READERS = java.util.Collections.emptyMap();

    private com.facebook.thrift.payload.Writer _createfrobnicateWriter() {
      return oprot -> {
        try {

        } catch (Throwable _e) {
          throw reactor.core.Exceptions.propagate(_e);
        }
      };
    }

    private final com.facebook.thrift.payload.Reader _frobnicate_READER =
      oprot -> {
                try {
                  int _r = oprot.readI32();
                  return _r;


                } catch (Throwable _e) {
                  throw reactor.core.Exceptions.propagate(_e);
                }
              };

    public reactor.core.publisher.Mono<Integer> frobnicate() {
      return frobnicateWrapper( com.facebook.thrift.client.RpcOptions.EMPTY).map(_p -> _p.getData());
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<Integer> frobnicate(RpcOptions rpcOptions)  {
      return frobnicateWrapper( rpcOptions).map(_p -> _p.getData());
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<ResponseWrapper<Integer>> frobnicateWrapper(RpcOptions rpcOptions)  {
      return _rpcClient
        .subscriberContext(ctx -> ctx.put(STICKY_HASH_KEY, interactionId))
        .flatMap(_rpc -> {
          String interactionName = "MyInteraction.frobnicate";
          org.apache.thrift.RequestRpcMetadata.Builder _metadataBuilder = new org.apache.thrift.RequestRpcMetadata.Builder()
                  .setName(interactionName)
                  .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                  .setOtherMetadata(getHeaders(rpcOptions))
                  .setProtocol(_protocolId);

          if (_activeInteractions.contains(interactionId)) {
            _metadataBuilder.setInteractionId(interactionId);
          } else {
            _metadataBuilder.setInteractionCreate(
              new InteractionCreate.Builder()
                  .setInteractionId(interactionId)
                  .setInteractionName("MyInteraction")
                  .build());
            _metadataBuilder.setInteractionId(0L);
            _activeInteractions.add(interactionId);
          }

          org.apache.thrift.RequestRpcMetadata _metadata = _metadataBuilder.build();

          com.facebook.thrift.payload.ClientRequestPayload<Integer> _crp =
              com.facebook.thrift.payload.ClientRequestPayload.create(
                  _createfrobnicateWriter(),
                  _frobnicate_READER,
                  _frobnicate_EXCEPTION_READERS_INT,
                  _metadata,
                  java.util.Collections.emptyMap());

          return _rpc
              .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());});
        });
    }

    private com.facebook.thrift.payload.Writer _createpingWriter() {
      return oprot -> {
        try {

        } catch (Throwable _e) {
          throw reactor.core.Exceptions.propagate(_e);
        }
      };
    }

    private final com.facebook.thrift.payload.Reader _ping_READER =
      oprot -> {
                try {

                  return null;

                } catch (Throwable _e) {
                  throw reactor.core.Exceptions.propagate(_e);
                }
              };

    public reactor.core.publisher.Mono<Void> ping() {
      return pingWrapper( com.facebook.thrift.client.RpcOptions.EMPTY).then();
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<Void> ping(RpcOptions rpcOptions)  {
      return pingWrapper( rpcOptions).then();
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<ResponseWrapper<Void>> pingWrapper(RpcOptions rpcOptions)  {
      return _rpcClient
        .subscriberContext(ctx -> ctx.put(STICKY_HASH_KEY, interactionId))
        .flatMap(_rpc -> {
          String interactionName = "MyInteraction.ping";
          org.apache.thrift.RequestRpcMetadata.Builder _metadataBuilder = new org.apache.thrift.RequestRpcMetadata.Builder()
                  .setName(interactionName)
                  .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_NO_RESPONSE)
                  .setOtherMetadata(getHeaders(rpcOptions))
                  .setProtocol(_protocolId);

          if (_activeInteractions.contains(interactionId)) {
            _metadataBuilder.setInteractionId(interactionId);
          } else {
            _metadataBuilder.setInteractionCreate(
              new InteractionCreate.Builder()
                  .setInteractionId(interactionId)
                  .setInteractionName("MyInteraction")
                  .build());
            _metadataBuilder.setInteractionId(0L);
            _activeInteractions.add(interactionId);
          }

          org.apache.thrift.RequestRpcMetadata _metadata = _metadataBuilder.build();

          com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
              com.facebook.thrift.payload.ClientRequestPayload.create(
                  _createpingWriter(),
                  _ping_READER,
                  _ping_EXCEPTION_READERS_INT,
                  _metadata,
                  java.util.Collections.emptyMap());

          return _rpc
              .singleRequestNoResponse(_crp, rpcOptions).thenReturn(ResponseWrapper.create(null, java.util.Collections.emptyMap(), java.util.Collections.emptyMap()));
        });
    }

    private com.facebook.thrift.payload.Writer _createtruthifyWriter() {
      return oprot -> {
        try {

        } catch (Throwable _e) {
          throw reactor.core.Exceptions.propagate(_e);
        }
      };
    }

    private final com.facebook.thrift.payload.Reader _truthify_READER =
      oprot -> {
                try {
                  boolean _r = oprot.readBool();
                  return _r;


                } catch (Throwable _e) {
                  throw reactor.core.Exceptions.propagate(_e);
                }
              };

    @java.lang.Override
    public reactor.core.publisher.Flux<com.facebook.thrift.client.ResponseWrapper<Boolean>> truthifyWrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
      return _rpcClient
        .subscriberContext(ctx -> ctx.put(STICKY_HASH_KEY, interactionId))
        .flatMapMany(_rpc -> {
          String interactionName = "MyInteraction.truthify";
          org.apache.thrift.RequestRpcMetadata.Builder _metadataBuilder = new org.apache.thrift.RequestRpcMetadata.Builder()
                  .setName(interactionName)
                  .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE)
                  .setOtherMetadata(getHeaders(rpcOptions))
                  .setProtocol(_protocolId);

          if (_activeInteractions.contains(interactionId)) {
            _metadataBuilder.setInteractionId(interactionId);
          } else {
            _metadataBuilder.setInteractionCreate(
              new InteractionCreate.Builder()
                  .setInteractionId(interactionId)
                  .setInteractionName("MyInteraction")
                  .build());
            _metadataBuilder.setInteractionId(0L);
            _activeInteractions.add(interactionId);
          }


          com.facebook.thrift.payload.ClientRequestPayload<Boolean> _crp =
              com.facebook.thrift.payload.ClientRequestPayload.create(
                  _createtruthifyWriter(),
                  _truthify_READER,
                  _truthify_EXCEPTION_READERS_INT,
                  _truthify_STREAM_EXCEPTION_READERS_INT,
                  _metadataBuilder.build(),
                  java.util.Collections.emptyMap());

          return _rpc
              .singleRequestStreamingResponse(_crp, rpcOptions)
              .doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());})
              .filter((_p) -> ((com.facebook.thrift.model.StreamResponse)_p.getData()).isSetData())
              .map(_p -> ResponseWrapper.create(((com.facebook.thrift.model.StreamResponse<Void, Boolean>)_p.getData()).getData(), _p.getHeaders(), _p.getBinaryHeaders()));
        });
    }

    @java.lang.Override
    public reactor.core.publisher.Flux<Boolean> truthify( final com.facebook.thrift.client.RpcOptions rpcOptions) {
        return truthifyWrapper( rpcOptions).map(_p -> _p.getData());
    }

    @java.lang.Override
    public reactor.core.publisher.Flux<Boolean> truthify() {
      return truthify( com.facebook.thrift.client.RpcOptions.EMPTY);
    }

    @java.lang.Override
    public void dispose() {
      _activeInteractions.remove(interactionId);
      _rpcClient
        .subscriberContext(ctx -> ctx.put(STICKY_HASH_KEY, interactionId))
        .flatMap(_rpc -> {
          InteractionTerminate term = new InteractionTerminate.Builder().setInteractionId(interactionId).build();
          ClientPushMetadata metadata = ClientPushMetadata.fromInteractionTerminate(term);
          return _rpc.metadataPush(metadata, com.facebook.thrift.client.RpcOptions.EMPTY);
        }).subscribe();
    }
  }

  public MyInteraction createMyInteraction() {
      return new MyInteractionImpl(_interactionCounter.incrementAndGet());
  }

  public class MyInteractionFastImpl implements MyInteractionFast {
    private final long interactionId;

    MyInteractionFastImpl(long interactionId) {
      this.interactionId = interactionId;
    }

    private final java.util.Map<Short, com.facebook.thrift.payload.Reader> _frobnicate_EXCEPTION_READERS = java.util.Collections.emptyMap();
    private final java.util.Map<Short, com.facebook.thrift.payload.Reader> _ping_EXCEPTION_READERS = java.util.Collections.emptyMap();

    private com.facebook.thrift.payload.Writer _createfrobnicateWriter() {
      return oprot -> {
        try {

        } catch (Throwable _e) {
          throw reactor.core.Exceptions.propagate(_e);
        }
      };
    }

    private final com.facebook.thrift.payload.Reader _frobnicate_READER =
      oprot -> {
                try {
                  int _r = oprot.readI32();
                  return _r;


                } catch (Throwable _e) {
                  throw reactor.core.Exceptions.propagate(_e);
                }
              };

    public reactor.core.publisher.Mono<Integer> frobnicate() {
      return frobnicateWrapper( com.facebook.thrift.client.RpcOptions.EMPTY).map(_p -> _p.getData());
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<Integer> frobnicate(RpcOptions rpcOptions)  {
      return frobnicateWrapper( rpcOptions).map(_p -> _p.getData());
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<ResponseWrapper<Integer>> frobnicateWrapper(RpcOptions rpcOptions)  {
      return _rpcClient
        .subscriberContext(ctx -> ctx.put(STICKY_HASH_KEY, interactionId))
        .flatMap(_rpc -> {
          String interactionName = "MyInteractionFast.frobnicate";
          org.apache.thrift.RequestRpcMetadata.Builder _metadataBuilder = new org.apache.thrift.RequestRpcMetadata.Builder()
                  .setName(interactionName)
                  .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                  .setOtherMetadata(getHeaders(rpcOptions))
                  .setProtocol(_protocolId);

          if (_activeInteractions.contains(interactionId)) {
            _metadataBuilder.setInteractionId(interactionId);
          } else {
            _metadataBuilder.setInteractionCreate(
              new InteractionCreate.Builder()
                  .setInteractionId(interactionId)
                  .setInteractionName("MyInteractionFast")
                  .build());
            _metadataBuilder.setInteractionId(0L);
            _activeInteractions.add(interactionId);
          }

          org.apache.thrift.RequestRpcMetadata _metadata = _metadataBuilder.build();

          com.facebook.thrift.payload.ClientRequestPayload<Integer> _crp =
              com.facebook.thrift.payload.ClientRequestPayload.create(
                  _createfrobnicateWriter(),
                  _frobnicate_READER,
                  _frobnicate_EXCEPTION_READERS_INT,
                  _metadata,
                  java.util.Collections.emptyMap());

          return _rpc
              .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());});
        });
    }

    private com.facebook.thrift.payload.Writer _createpingWriter() {
      return oprot -> {
        try {

        } catch (Throwable _e) {
          throw reactor.core.Exceptions.propagate(_e);
        }
      };
    }

    private final com.facebook.thrift.payload.Reader _ping_READER =
      oprot -> {
                try {

                  return null;

                } catch (Throwable _e) {
                  throw reactor.core.Exceptions.propagate(_e);
                }
              };

    public reactor.core.publisher.Mono<Void> ping() {
      return pingWrapper( com.facebook.thrift.client.RpcOptions.EMPTY).then();
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<Void> ping(RpcOptions rpcOptions)  {
      return pingWrapper( rpcOptions).then();
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<ResponseWrapper<Void>> pingWrapper(RpcOptions rpcOptions)  {
      return _rpcClient
        .subscriberContext(ctx -> ctx.put(STICKY_HASH_KEY, interactionId))
        .flatMap(_rpc -> {
          String interactionName = "MyInteractionFast.ping";
          org.apache.thrift.RequestRpcMetadata.Builder _metadataBuilder = new org.apache.thrift.RequestRpcMetadata.Builder()
                  .setName(interactionName)
                  .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_NO_RESPONSE)
                  .setOtherMetadata(getHeaders(rpcOptions))
                  .setProtocol(_protocolId);

          if (_activeInteractions.contains(interactionId)) {
            _metadataBuilder.setInteractionId(interactionId);
          } else {
            _metadataBuilder.setInteractionCreate(
              new InteractionCreate.Builder()
                  .setInteractionId(interactionId)
                  .setInteractionName("MyInteractionFast")
                  .build());
            _metadataBuilder.setInteractionId(0L);
            _activeInteractions.add(interactionId);
          }

          org.apache.thrift.RequestRpcMetadata _metadata = _metadataBuilder.build();

          com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
              com.facebook.thrift.payload.ClientRequestPayload.create(
                  _createpingWriter(),
                  _ping_READER,
                  _ping_EXCEPTION_READERS_INT,
                  _metadata,
                  java.util.Collections.emptyMap());

          return _rpc
              .singleRequestNoResponse(_crp, rpcOptions).thenReturn(ResponseWrapper.create(null, java.util.Collections.emptyMap(), java.util.Collections.emptyMap()));
        });
    }

    private com.facebook.thrift.payload.Writer _createtruthifyWriter() {
      return oprot -> {
        try {

        } catch (Throwable _e) {
          throw reactor.core.Exceptions.propagate(_e);
        }
      };
    }

    private final com.facebook.thrift.payload.Reader _truthify_READER =
      oprot -> {
                try {
                  boolean _r = oprot.readBool();
                  return _r;


                } catch (Throwable _e) {
                  throw reactor.core.Exceptions.propagate(_e);
                }
              };

    @java.lang.Override
    public reactor.core.publisher.Flux<com.facebook.thrift.client.ResponseWrapper<Boolean>> truthifyWrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
      return _rpcClient
        .subscriberContext(ctx -> ctx.put(STICKY_HASH_KEY, interactionId))
        .flatMapMany(_rpc -> {
          String interactionName = "MyInteractionFast.truthify";
          org.apache.thrift.RequestRpcMetadata.Builder _metadataBuilder = new org.apache.thrift.RequestRpcMetadata.Builder()
                  .setName(interactionName)
                  .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE)
                  .setOtherMetadata(getHeaders(rpcOptions))
                  .setProtocol(_protocolId);

          if (_activeInteractions.contains(interactionId)) {
            _metadataBuilder.setInteractionId(interactionId);
          } else {
            _metadataBuilder.setInteractionCreate(
              new InteractionCreate.Builder()
                  .setInteractionId(interactionId)
                  .setInteractionName("MyInteractionFast")
                  .build());
            _metadataBuilder.setInteractionId(0L);
            _activeInteractions.add(interactionId);
          }


          com.facebook.thrift.payload.ClientRequestPayload<Boolean> _crp =
              com.facebook.thrift.payload.ClientRequestPayload.create(
                  _createtruthifyWriter(),
                  _truthify_READER,
                  _truthify_EXCEPTION_READERS_INT,
                  _truthify_STREAM_EXCEPTION_READERS_INT,
                  _metadataBuilder.build(),
                  java.util.Collections.emptyMap());

          return _rpc
              .singleRequestStreamingResponse(_crp, rpcOptions)
              .doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());})
              .filter((_p) -> ((com.facebook.thrift.model.StreamResponse)_p.getData()).isSetData())
              .map(_p -> ResponseWrapper.create(((com.facebook.thrift.model.StreamResponse<Void, Boolean>)_p.getData()).getData(), _p.getHeaders(), _p.getBinaryHeaders()));
        });
    }

    @java.lang.Override
    public reactor.core.publisher.Flux<Boolean> truthify( final com.facebook.thrift.client.RpcOptions rpcOptions) {
        return truthifyWrapper( rpcOptions).map(_p -> _p.getData());
    }

    @java.lang.Override
    public reactor.core.publisher.Flux<Boolean> truthify() {
      return truthify( com.facebook.thrift.client.RpcOptions.EMPTY);
    }

    @java.lang.Override
    public void dispose() {
      _activeInteractions.remove(interactionId);
      _rpcClient
        .subscriberContext(ctx -> ctx.put(STICKY_HASH_KEY, interactionId))
        .flatMap(_rpc -> {
          InteractionTerminate term = new InteractionTerminate.Builder().setInteractionId(interactionId).build();
          ClientPushMetadata metadata = ClientPushMetadata.fromInteractionTerminate(term);
          return _rpc.metadataPush(metadata, com.facebook.thrift.client.RpcOptions.EMPTY);
        }).subscribe();
    }
  }

  public MyInteractionFast createMyInteractionFast() {
      return new MyInteractionFastImpl(_interactionCounter.incrementAndGet());
  }

  public class SerialInteractionImpl implements SerialInteraction {
    private final long interactionId;

    SerialInteractionImpl(long interactionId) {
      this.interactionId = interactionId;
    }

    private final java.util.Map<Short, com.facebook.thrift.payload.Reader> _frobnicate_EXCEPTION_READERS = java.util.Collections.emptyMap();

    private com.facebook.thrift.payload.Writer _createfrobnicateWriter() {
      return oprot -> {
        try {

        } catch (Throwable _e) {
          throw reactor.core.Exceptions.propagate(_e);
        }
      };
    }

    private final com.facebook.thrift.payload.Reader _frobnicate_READER =
      oprot -> {
                try {

                  return null;

                } catch (Throwable _e) {
                  throw reactor.core.Exceptions.propagate(_e);
                }
              };

    public reactor.core.publisher.Mono<Void> frobnicate() {
      return frobnicateWrapper( com.facebook.thrift.client.RpcOptions.EMPTY).then();
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<Void> frobnicate(RpcOptions rpcOptions)  {
      return frobnicateWrapper( rpcOptions).then();
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<ResponseWrapper<Void>> frobnicateWrapper(RpcOptions rpcOptions)  {
      return _rpcClient
        .subscriberContext(ctx -> ctx.put(STICKY_HASH_KEY, interactionId))
        .flatMap(_rpc -> {
          String interactionName = "SerialInteraction.frobnicate";
          org.apache.thrift.RequestRpcMetadata.Builder _metadataBuilder = new org.apache.thrift.RequestRpcMetadata.Builder()
                  .setName(interactionName)
                  .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                  .setOtherMetadata(getHeaders(rpcOptions))
                  .setProtocol(_protocolId);

          if (_activeInteractions.contains(interactionId)) {
            _metadataBuilder.setInteractionId(interactionId);
          } else {
            _metadataBuilder.setInteractionCreate(
              new InteractionCreate.Builder()
                  .setInteractionId(interactionId)
                  .setInteractionName("SerialInteraction")
                  .build());
            _metadataBuilder.setInteractionId(0L);
            _activeInteractions.add(interactionId);
          }

          org.apache.thrift.RequestRpcMetadata _metadata = _metadataBuilder.build();

          com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
              com.facebook.thrift.payload.ClientRequestPayload.create(
                  _createfrobnicateWriter(),
                  _frobnicate_READER,
                  _frobnicate_EXCEPTION_READERS_INT,
                  _metadata,
                  java.util.Collections.emptyMap());

          return _rpc
              .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());});
        });
    }

    @java.lang.Override
    public void dispose() {
      _activeInteractions.remove(interactionId);
      _rpcClient
        .subscriberContext(ctx -> ctx.put(STICKY_HASH_KEY, interactionId))
        .flatMap(_rpc -> {
          InteractionTerminate term = new InteractionTerminate.Builder().setInteractionId(interactionId).build();
          ClientPushMetadata metadata = ClientPushMetadata.fromInteractionTerminate(term);
          return _rpc.metadataPush(metadata, com.facebook.thrift.client.RpcOptions.EMPTY);
        }).subscribe();
    }
  }

  public SerialInteraction createSerialInteraction() {
      return new SerialInteractionImpl(_interactionCounter.incrementAndGet());
  }

  private Map<String, String> getHeaders(com.facebook.thrift.client.RpcOptions rpcOptions) {
      Map<String, String> headers = new HashMap<>();
      if (rpcOptions.getRequestHeaders() != null && !rpcOptions.getRequestHeaders().isEmpty()) {
          headers.putAll(rpcOptions.getRequestHeaders());
      }
      if (_headers != null && !_headers.isEmpty()) {
          headers.putAll(_headers);
      }
      if (_persistentHeaders != null && !_persistentHeaders.isEmpty()) {
          headers.putAll(_persistentHeaders);
      }
      return headers;
  }
}
