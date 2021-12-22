/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.exceptions;

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

public class RaiserReactiveClient 
  implements Raiser.Reactive {
  private static final AtomicLong _interactionCounter = new AtomicLong(0);

  private final org.apache.thrift.ProtocolId _protocolId;
  private final reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient;
  private final Map<String, String> _headers;
  private final Map<String, String> _persistentHeaders;
  private final Set<Long> _activeInteractions;

  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _doBland_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _doRaise_EXCEPTION_READERS = new HashMap<>();
  private static final com.facebook.thrift.payload.Reader _doRaise_EXCEPTION_READER0 =
  oprot -> {
            try {
              test.fixtures.exceptions.Banal _r = test.fixtures.exceptions.Banal.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final com.facebook.thrift.payload.Reader _doRaise_EXCEPTION_READER1 =
  oprot -> {
            try {
              test.fixtures.exceptions.Fiery _r = test.fixtures.exceptions.Fiery.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final com.facebook.thrift.payload.Reader _doRaise_EXCEPTION_READER2 =
  oprot -> {
            try {
              test.fixtures.exceptions.Serious _r = test.fixtures.exceptions.Serious.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _get200_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _get500_EXCEPTION_READERS = new HashMap<>();
  private static final com.facebook.thrift.payload.Reader _get500_EXCEPTION_READER0 =
  oprot -> {
            try {
              test.fixtures.exceptions.Fiery _r = test.fixtures.exceptions.Fiery.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final com.facebook.thrift.payload.Reader _get500_EXCEPTION_READER1 =
  oprot -> {
            try {
              test.fixtures.exceptions.Banal _r = test.fixtures.exceptions.Banal.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final com.facebook.thrift.payload.Reader _get500_EXCEPTION_READER2 =
  oprot -> {
            try {
              test.fixtures.exceptions.Serious _r = test.fixtures.exceptions.Serious.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };


  static {
    _doRaise_EXCEPTION_READERS.put((short)1, _doRaise_EXCEPTION_READER0);
    _doRaise_EXCEPTION_READERS.put((short)2, _doRaise_EXCEPTION_READER1);
    _doRaise_EXCEPTION_READERS.put((short)3, _doRaise_EXCEPTION_READER2);
    _get500_EXCEPTION_READERS.put((short)1, _get500_EXCEPTION_READER0);
    _get500_EXCEPTION_READERS.put((short)2, _get500_EXCEPTION_READER1);
    _get500_EXCEPTION_READERS.put((short)3, _get500_EXCEPTION_READER2);
  }

  public RaiserReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient) {
    
    this._protocolId = _protocolId;
    this._rpcClient = _rpcClient;
    this._headers = java.util.Collections.emptyMap();
    this._persistentHeaders = java.util.Collections.emptyMap();
    this._activeInteractions = ConcurrentHashMap.newKeySet();
  }

  public RaiserReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(_protocolId, _rpcClient, _headers, _persistentHeaders, new AtomicLong(), ConcurrentHashMap.newKeySet());
  }

  public RaiserReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders, AtomicLong interactionCounter, Set<Long> activeInteractions) {
    
    this._protocolId = _protocolId;
    this._rpcClient = _rpcClient;
    this._headers = _headers;
    this._persistentHeaders = _persistentHeaders;
    this._activeInteractions = activeInteractions;
  }

  @java.lang.Override
  public void dispose() {}

  private com.facebook.thrift.payload.Writer _createdoBlandWriter() {
    return oprot -> {
      try {

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _doBland_READER =
    oprot -> {
              try {

                return null;

              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };


  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Void>> doBlandWrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("doBland")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createdoBlandWriter(),
                    _doBland_READER,
                    _doBland_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> doBland( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return doBlandWrapper( rpcOptions).then();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> doBland() {
    return doBland( com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createdoRaiseWriter() {
    return oprot -> {
      try {

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _doRaise_READER =
    oprot -> {
              try {

                return null;

              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };


  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Void>> doRaiseWrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("doRaise")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createdoRaiseWriter(),
                    _doRaise_READER,
                    _doRaise_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> doRaise( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return doRaiseWrapper( rpcOptions).then();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> doRaise() {
    return doRaise( com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createget200Writer() {
    return oprot -> {
      try {

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _get200_READER =
    oprot -> {
              try {
                String _r = oprot.readString();
                return _r;


              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };


  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<String>> get200Wrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("get200")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<String> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createget200Writer(),
                    _get200_READER,
                    _get200_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<String> get200( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return get200Wrapper( rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<String> get200() {
    return get200( com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createget500Writer() {
    return oprot -> {
      try {

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _get500_READER =
    oprot -> {
              try {
                String _r = oprot.readString();
                return _r;


              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };


  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<String>> get500Wrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("get500")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<String> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createget500Writer(),
                    _get500_READER,
                    _get500_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<String> get500( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return get500Wrapper( rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<String> get500() {
    return get500( com.facebook.thrift.client.RpcOptions.EMPTY);
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
