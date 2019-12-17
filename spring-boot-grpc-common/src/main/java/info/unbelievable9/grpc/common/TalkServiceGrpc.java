package info.unbelievable9.grpc.common;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: talk.proto")
public final class TalkServiceGrpc {

  private TalkServiceGrpc() {}

  public static final String SERVICE_NAME = "TalkService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<info.unbelievable9.grpc.common.Talk.GreetingMessage,
      info.unbelievable9.grpc.common.Talk.ReplyMessage> METHOD_SAY_HELLO = getSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<info.unbelievable9.grpc.common.Talk.GreetingMessage,
      info.unbelievable9.grpc.common.Talk.ReplyMessage> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<info.unbelievable9.grpc.common.Talk.GreetingMessage,
      info.unbelievable9.grpc.common.Talk.ReplyMessage> getSayHelloMethod() {
    return getSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<info.unbelievable9.grpc.common.Talk.GreetingMessage,
      info.unbelievable9.grpc.common.Talk.ReplyMessage> getSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<info.unbelievable9.grpc.common.Talk.GreetingMessage, info.unbelievable9.grpc.common.Talk.ReplyMessage> getSayHelloMethod;
    if ((getSayHelloMethod = TalkServiceGrpc.getSayHelloMethod) == null) {
      synchronized (TalkServiceGrpc.class) {
        if ((getSayHelloMethod = TalkServiceGrpc.getSayHelloMethod) == null) {
          TalkServiceGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<info.unbelievable9.grpc.common.Talk.GreetingMessage, info.unbelievable9.grpc.common.Talk.ReplyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TalkService", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.unbelievable9.grpc.common.Talk.GreetingMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.unbelievable9.grpc.common.Talk.ReplyMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new TalkServiceMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TalkServiceStub newStub(io.grpc.Channel channel) {
    return new TalkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TalkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TalkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TalkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TalkServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TalkServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(info.unbelievable9.grpc.common.Talk.GreetingMessage request,
        io.grpc.stub.StreamObserver<info.unbelievable9.grpc.common.Talk.ReplyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                info.unbelievable9.grpc.common.Talk.GreetingMessage,
                info.unbelievable9.grpc.common.Talk.ReplyMessage>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class TalkServiceStub extends io.grpc.stub.AbstractStub<TalkServiceStub> {
    private TalkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TalkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TalkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TalkServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(info.unbelievable9.grpc.common.Talk.GreetingMessage request,
        io.grpc.stub.StreamObserver<info.unbelievable9.grpc.common.Talk.ReplyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TalkServiceBlockingStub extends io.grpc.stub.AbstractStub<TalkServiceBlockingStub> {
    private TalkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TalkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TalkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TalkServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public info.unbelievable9.grpc.common.Talk.ReplyMessage sayHello(info.unbelievable9.grpc.common.Talk.GreetingMessage request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TalkServiceFutureStub extends io.grpc.stub.AbstractStub<TalkServiceFutureStub> {
    private TalkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TalkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TalkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TalkServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.unbelievable9.grpc.common.Talk.ReplyMessage> sayHello(
        info.unbelievable9.grpc.common.Talk.GreetingMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TalkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TalkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((info.unbelievable9.grpc.common.Talk.GreetingMessage) request,
              (io.grpc.stub.StreamObserver<info.unbelievable9.grpc.common.Talk.ReplyMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TalkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TalkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return info.unbelievable9.grpc.common.Talk.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TalkService");
    }
  }

  private static final class TalkServiceFileDescriptorSupplier
      extends TalkServiceBaseDescriptorSupplier {
    TalkServiceFileDescriptorSupplier() {}
  }

  private static final class TalkServiceMethodDescriptorSupplier
      extends TalkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TalkServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TalkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TalkServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
