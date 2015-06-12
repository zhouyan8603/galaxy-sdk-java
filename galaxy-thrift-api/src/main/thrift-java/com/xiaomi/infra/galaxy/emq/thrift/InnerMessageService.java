/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-6-1")
public class InnerMessageService {

  public interface Iface extends com.xiaomi.infra.galaxy.emq.thrift.MessageService.Iface {

    public List<PollingResponse> pollMessage(List<PollingRequest> requests) throws libthrift091.TException;

  }

  public interface AsyncIface extends com.xiaomi.infra.galaxy.emq.thrift.MessageService .AsyncIface {

    public void pollMessage(List<PollingRequest> requests, libthrift091.async.AsyncMethodCallback resultHandler) throws libthrift091.TException;

  }

  public static class Client extends com.xiaomi.infra.galaxy.emq.thrift.MessageService.Client implements Iface {
    public static class Factory implements libthrift091.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(libthrift091.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(libthrift091.protocol.TProtocol iprot, libthrift091.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(libthrift091.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(libthrift091.protocol.TProtocol iprot, libthrift091.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public List<PollingResponse> pollMessage(List<PollingRequest> requests) throws libthrift091.TException
    {
      send_pollMessage(requests);
      return recv_pollMessage();
    }

    public void send_pollMessage(List<PollingRequest> requests) throws libthrift091.TException
    {
      pollMessage_args args = new pollMessage_args();
      args.setRequests(requests);
      sendBase("pollMessage", args);
    }

    public List<PollingResponse> recv_pollMessage() throws libthrift091.TException
    {
      pollMessage_result result = new pollMessage_result();
      receiveBase(result, "pollMessage");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new libthrift091.TApplicationException(libthrift091.TApplicationException.MISSING_RESULT, "pollMessage failed: unknown result");
    }

  }
  public static class AsyncClient extends com.xiaomi.infra.galaxy.emq.thrift.MessageService.AsyncClient implements AsyncIface {
    public static class Factory implements libthrift091.async.TAsyncClientFactory<AsyncClient> {
      private libthrift091.async.TAsyncClientManager clientManager;
      private libthrift091.protocol.TProtocolFactory protocolFactory;
      public Factory(libthrift091.async.TAsyncClientManager clientManager, libthrift091.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(libthrift091.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(libthrift091.protocol.TProtocolFactory protocolFactory, libthrift091.async.TAsyncClientManager clientManager, libthrift091.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void pollMessage(List<PollingRequest> requests, libthrift091.async.AsyncMethodCallback resultHandler) throws libthrift091.TException {
      checkReady();
      pollMessage_call method_call = new pollMessage_call(requests, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class pollMessage_call extends libthrift091.async.TAsyncMethodCall {
      private List<PollingRequest> requests;
      public pollMessage_call(List<PollingRequest> requests, libthrift091.async.AsyncMethodCallback resultHandler, libthrift091.async.TAsyncClient client, libthrift091.protocol.TProtocolFactory protocolFactory, libthrift091.transport.TNonblockingTransport transport) throws libthrift091.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.requests = requests;
      }

      public void write_args(libthrift091.protocol.TProtocol prot) throws libthrift091.TException {
        prot.writeMessageBegin(new libthrift091.protocol.TMessage("pollMessage", libthrift091.protocol.TMessageType.CALL, 0));
        pollMessage_args args = new pollMessage_args();
        args.setRequests(requests);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public List<PollingResponse> getResult() throws libthrift091.TException {
        if (getState() != libthrift091.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        libthrift091.transport.TMemoryInputTransport memoryTransport = new libthrift091.transport.TMemoryInputTransport(getFrameBuffer().array());
        libthrift091.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_pollMessage();
      }
    }

  }

  public static class Processor<I extends Iface> extends com.xiaomi.infra.galaxy.emq.thrift.MessageService.Processor<I> implements libthrift091.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, libthrift091.ProcessFunction<I, ? extends libthrift091.TBase>>()));
    }

    protected Processor(I iface, Map<String,  libthrift091.ProcessFunction<I, ? extends  libthrift091.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  libthrift091.ProcessFunction<I, ? extends  libthrift091.TBase>> getProcessMap(Map<String,  libthrift091.ProcessFunction<I, ? extends  libthrift091.TBase>> processMap) {
      processMap.put("pollMessage", new pollMessage());
      return processMap;
    }

    public static class pollMessage<I extends Iface> extends libthrift091.ProcessFunction<I, pollMessage_args> {
      public pollMessage() {
        super("pollMessage");
      }

      public pollMessage_args getEmptyArgsInstance() {
        return new pollMessage_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public pollMessage_result getResult(I iface, pollMessage_args args) throws libthrift091.TException {
        pollMessage_result result = new pollMessage_result();
        result.success = iface.pollMessage(args.requests);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends com.xiaomi.infra.galaxy.emq.thrift.MessageService.AsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, libthrift091.AsyncProcessFunction<I, ? extends libthrift091.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  libthrift091.AsyncProcessFunction<I, ? extends  libthrift091.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  libthrift091.AsyncProcessFunction<I, ? extends  libthrift091.TBase,?>> getProcessMap(Map<String,  libthrift091.AsyncProcessFunction<I, ? extends  libthrift091.TBase, ?>> processMap) {
      processMap.put("pollMessage", new pollMessage());
      return processMap;
    }

    public static class pollMessage<I extends AsyncIface> extends libthrift091.AsyncProcessFunction<I, pollMessage_args, List<PollingResponse>> {
      public pollMessage() {
        super("pollMessage");
      }

      public pollMessage_args getEmptyArgsInstance() {
        return new pollMessage_args();
      }

      public AsyncMethodCallback<List<PollingResponse>> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final libthrift091.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<List<PollingResponse>>() { 
          public void onComplete(List<PollingResponse> o) {
            pollMessage_result result = new pollMessage_result();
            result.success = o;
            try {
              fcall.sendResponse(fb,result, libthrift091.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = libthrift091.protocol.TMessageType.REPLY;
            libthrift091.TBase msg;
            pollMessage_result result = new pollMessage_result();
            {
              msgType = libthrift091.protocol.TMessageType.EXCEPTION;
              msg = (libthrift091.TBase)new libthrift091.TApplicationException(libthrift091.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, pollMessage_args args, libthrift091.async.AsyncMethodCallback<List<PollingResponse>> resultHandler) throws TException {
        iface.pollMessage(args.requests,resultHandler);
      }
    }

  }

  public static class pollMessage_args implements libthrift091.TBase<pollMessage_args, pollMessage_args._Fields>, java.io.Serializable, Cloneable, Comparable<pollMessage_args>   {
    private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("pollMessage_args");

    private static final libthrift091.protocol.TField REQUESTS_FIELD_DESC = new libthrift091.protocol.TField("requests", libthrift091.protocol.TType.LIST, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new pollMessage_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new pollMessage_argsTupleSchemeFactory());
    }

    public List<PollingRequest> requests; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements libthrift091.TFieldIdEnum {
      REQUESTS((short)1, "requests");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // REQUESTS
            return REQUESTS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.REQUESTS, new libthrift091.meta_data.FieldMetaData("requests", libthrift091.TFieldRequirementType.DEFAULT, 
          new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
              new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, PollingRequest.class))));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(pollMessage_args.class, metaDataMap);
    }

    public pollMessage_args() {
    }

    public pollMessage_args(
      List<PollingRequest> requests)
    {
      this();
      this.requests = requests;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public pollMessage_args(pollMessage_args other) {
      if (other.isSetRequests()) {
        List<PollingRequest> __this__requests = new ArrayList<PollingRequest>(other.requests.size());
        for (PollingRequest other_element : other.requests) {
          __this__requests.add(new PollingRequest(other_element));
        }
        this.requests = __this__requests;
      }
    }

    public pollMessage_args deepCopy() {
      return new pollMessage_args(this);
    }

    @Override
    public void clear() {
      this.requests = null;
    }

    public int getRequestsSize() {
      return (this.requests == null) ? 0 : this.requests.size();
    }

    public java.util.Iterator<PollingRequest> getRequestsIterator() {
      return (this.requests == null) ? null : this.requests.iterator();
    }

    public void addToRequests(PollingRequest elem) {
      if (this.requests == null) {
        this.requests = new ArrayList<PollingRequest>();
      }
      this.requests.add(elem);
    }

    public List<PollingRequest> getRequests() {
      return this.requests;
    }

    public pollMessage_args setRequests(List<PollingRequest> requests) {
      this.requests = requests;
      return this;
    }

    public void unsetRequests() {
      this.requests = null;
    }

    /** Returns true if field requests is set (has been assigned a value) and false otherwise */
    public boolean isSetRequests() {
      return this.requests != null;
    }

    public void setRequestsIsSet(boolean value) {
      if (!value) {
        this.requests = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case REQUESTS:
        if (value == null) {
          unsetRequests();
        } else {
          setRequests((List<PollingRequest>)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case REQUESTS:
        return getRequests();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case REQUESTS:
        return isSetRequests();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof pollMessage_args)
        return this.equals((pollMessage_args)that);
      return false;
    }

    public boolean equals(pollMessage_args that) {
      if (that == null)
        return false;

      boolean this_present_requests = true && this.isSetRequests();
      boolean that_present_requests = true && that.isSetRequests();
      if (this_present_requests || that_present_requests) {
        if (!(this_present_requests && that_present_requests))
          return false;
        if (!this.requests.equals(that.requests))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_requests = true && (isSetRequests());
      list.add(present_requests);
      if (present_requests)
        list.add(requests);

      return list.hashCode();
    }

    @Override
    public int compareTo(pollMessage_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetRequests()).compareTo(other.isSetRequests());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetRequests()) {
        lastComparison = libthrift091.TBaseHelper.compareTo(this.requests, other.requests);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("pollMessage_args(");
      boolean first = true;

      sb.append("requests:");
      if (this.requests == null) {
        sb.append("null");
      } else {
        sb.append(this.requests);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws libthrift091.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
      } catch (libthrift091.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
      } catch (libthrift091.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class pollMessage_argsStandardSchemeFactory implements SchemeFactory {
      public pollMessage_argsStandardScheme getScheme() {
        return new pollMessage_argsStandardScheme();
      }
    }

    private static class pollMessage_argsStandardScheme extends StandardScheme<pollMessage_args> {

      public void read(libthrift091.protocol.TProtocol iprot, pollMessage_args struct) throws libthrift091.TException {
        libthrift091.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == libthrift091.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // REQUESTS
              if (schemeField.type == libthrift091.protocol.TType.LIST) {
                {
                  libthrift091.protocol.TList _list8 = iprot.readListBegin();
                  struct.requests = new ArrayList<PollingRequest>(_list8.size);
                  PollingRequest _elem9;
                  for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                  {
                    _elem9 = new PollingRequest();
                    _elem9.read(iprot);
                    struct.requests.add(_elem9);
                  }
                  iprot.readListEnd();
                }
                struct.setRequestsIsSet(true);
              } else { 
                libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(libthrift091.protocol.TProtocol oprot, pollMessage_args struct) throws libthrift091.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.requests != null) {
          oprot.writeFieldBegin(REQUESTS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.requests.size()));
            for (PollingRequest _iter11 : struct.requests)
            {
              _iter11.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class pollMessage_argsTupleSchemeFactory implements SchemeFactory {
      public pollMessage_argsTupleScheme getScheme() {
        return new pollMessage_argsTupleScheme();
      }
    }

    private static class pollMessage_argsTupleScheme extends TupleScheme<pollMessage_args> {

      @Override
      public void write(libthrift091.protocol.TProtocol prot, pollMessage_args struct) throws libthrift091.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetRequests()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetRequests()) {
          {
            oprot.writeI32(struct.requests.size());
            for (PollingRequest _iter12 : struct.requests)
            {
              _iter12.write(oprot);
            }
          }
        }
      }

      @Override
      public void read(libthrift091.protocol.TProtocol prot, pollMessage_args struct) throws libthrift091.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          {
            libthrift091.protocol.TList _list13 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
            struct.requests = new ArrayList<PollingRequest>(_list13.size);
            PollingRequest _elem14;
            for (int _i15 = 0; _i15 < _list13.size; ++_i15)
            {
              _elem14 = new PollingRequest();
              _elem14.read(iprot);
              struct.requests.add(_elem14);
            }
          }
          struct.setRequestsIsSet(true);
        }
      }
    }

  }

  public static class pollMessage_result implements libthrift091.TBase<pollMessage_result, pollMessage_result._Fields>, java.io.Serializable, Cloneable, Comparable<pollMessage_result>   {
    private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("pollMessage_result");

    private static final libthrift091.protocol.TField SUCCESS_FIELD_DESC = new libthrift091.protocol.TField("success", libthrift091.protocol.TType.LIST, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new pollMessage_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new pollMessage_resultTupleSchemeFactory());
    }

    public List<PollingResponse> success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements libthrift091.TFieldIdEnum {
      SUCCESS((short)0, "success");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 0: // SUCCESS
            return SUCCESS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new libthrift091.meta_data.FieldMetaData("success", libthrift091.TFieldRequirementType.DEFAULT, 
          new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
              new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, PollingResponse.class))));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(pollMessage_result.class, metaDataMap);
    }

    public pollMessage_result() {
    }

    public pollMessage_result(
      List<PollingResponse> success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public pollMessage_result(pollMessage_result other) {
      if (other.isSetSuccess()) {
        List<PollingResponse> __this__success = new ArrayList<PollingResponse>(other.success.size());
        for (PollingResponse other_element : other.success) {
          __this__success.add(new PollingResponse(other_element));
        }
        this.success = __this__success;
      }
    }

    public pollMessage_result deepCopy() {
      return new pollMessage_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    public int getSuccessSize() {
      return (this.success == null) ? 0 : this.success.size();
    }

    public java.util.Iterator<PollingResponse> getSuccessIterator() {
      return (this.success == null) ? null : this.success.iterator();
    }

    public void addToSuccess(PollingResponse elem) {
      if (this.success == null) {
        this.success = new ArrayList<PollingResponse>();
      }
      this.success.add(elem);
    }

    public List<PollingResponse> getSuccess() {
      return this.success;
    }

    public pollMessage_result setSuccess(List<PollingResponse> success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((List<PollingResponse>)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof pollMessage_result)
        return this.equals((pollMessage_result)that);
      return false;
    }

    public boolean equals(pollMessage_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_success = true && (isSetSuccess());
      list.add(present_success);
      if (present_success)
        list.add(success);

      return list.hashCode();
    }

    @Override
    public int compareTo(pollMessage_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = libthrift091.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("pollMessage_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws libthrift091.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
      } catch (libthrift091.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
      } catch (libthrift091.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class pollMessage_resultStandardSchemeFactory implements SchemeFactory {
      public pollMessage_resultStandardScheme getScheme() {
        return new pollMessage_resultStandardScheme();
      }
    }

    private static class pollMessage_resultStandardScheme extends StandardScheme<pollMessage_result> {

      public void read(libthrift091.protocol.TProtocol iprot, pollMessage_result struct) throws libthrift091.TException {
        libthrift091.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == libthrift091.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == libthrift091.protocol.TType.LIST) {
                {
                  libthrift091.protocol.TList _list16 = iprot.readListBegin();
                  struct.success = new ArrayList<PollingResponse>(_list16.size);
                  PollingResponse _elem17;
                  for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                  {
                    _elem17 = new PollingResponse();
                    _elem17.read(iprot);
                    struct.success.add(_elem17);
                  }
                  iprot.readListEnd();
                }
                struct.setSuccessIsSet(true);
              } else { 
                libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(libthrift091.protocol.TProtocol oprot, pollMessage_result struct) throws libthrift091.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.success.size()));
            for (PollingResponse _iter19 : struct.success)
            {
              _iter19.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class pollMessage_resultTupleSchemeFactory implements SchemeFactory {
      public pollMessage_resultTupleScheme getScheme() {
        return new pollMessage_resultTupleScheme();
      }
    }

    private static class pollMessage_resultTupleScheme extends TupleScheme<pollMessage_result> {

      @Override
      public void write(libthrift091.protocol.TProtocol prot, pollMessage_result struct) throws libthrift091.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          {
            oprot.writeI32(struct.success.size());
            for (PollingResponse _iter20 : struct.success)
            {
              _iter20.write(oprot);
            }
          }
        }
      }

      @Override
      public void read(libthrift091.protocol.TProtocol prot, pollMessage_result struct) throws libthrift091.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          {
            libthrift091.protocol.TList _list21 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
            struct.success = new ArrayList<PollingResponse>(_list21.size);
            PollingResponse _elem22;
            for (int _i23 = 0; _i23 < _list21.size; ++_i23)
            {
              _elem22 = new PollingResponse();
              _elem22.read(iprot);
              struct.success.add(_elem22);
            }
          }
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}