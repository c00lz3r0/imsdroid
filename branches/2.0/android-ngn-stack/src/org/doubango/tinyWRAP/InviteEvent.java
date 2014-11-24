/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class InviteEvent extends SipEvent {
  private long swigCPtr;

  protected InviteEvent(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.InviteEvent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InviteEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_InviteEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public tsip_invite_event_type_t getType() {
    return tsip_invite_event_type_t.swigToEnum(tinyWRAPJNI.InviteEvent_getType(swigCPtr, this));
  }

  public twrap_media_type_t getMediaType() {
    return twrap_media_type_t.swigToEnum(tinyWRAPJNI.InviteEvent_getMediaType(swigCPtr, this));
  }

  public InviteSession getSession() {
    long cPtr = tinyWRAPJNI.InviteEvent_getSession(swigCPtr, this);
    return (cPtr == 0) ? null : new InviteSession(cPtr, false);
  }

  public CallSession takeCallSessionOwnership() {
    long cPtr = tinyWRAPJNI.InviteEvent_takeCallSessionOwnership(swigCPtr, this);
    return (cPtr == 0) ? null : new CallSession(cPtr, true);
  }

  public MsrpSession takeMsrpSessionOwnership() {
    long cPtr = tinyWRAPJNI.InviteEvent_takeMsrpSessionOwnership(swigCPtr, this);
    return (cPtr == 0) ? null : new MsrpSession(cPtr, true);
  }

}
