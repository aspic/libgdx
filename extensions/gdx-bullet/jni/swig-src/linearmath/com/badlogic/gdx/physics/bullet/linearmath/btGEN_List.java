/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btGEN_List extends BulletBase {
	private long swigCPtr;
	
	protected btGEN_List(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGEN_List, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGEN_List(long cPtr, boolean cMemoryOwn) {
		this("btGEN_List", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGEN_List obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				LinearMathJNI.delete_btGEN_List(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btGEN_List() {
    this(LinearMathJNI.new_btGEN_List(), true);
  }

  public btGEN_Link getHead() {
    long cPtr = LinearMathJNI.btGEN_List_getHead(swigCPtr, this);
    return (cPtr == 0) ? null : new btGEN_Link(cPtr, false);
  }

  public btGEN_Link getTail() {
    long cPtr = LinearMathJNI.btGEN_List_getTail(swigCPtr, this);
    return (cPtr == 0) ? null : new btGEN_Link(cPtr, false);
  }

  public void addHead(btGEN_Link link) {
    LinearMathJNI.btGEN_List_addHead(swigCPtr, this, btGEN_Link.getCPtr(link), link);
  }

  public void addTail(btGEN_Link link) {
    LinearMathJNI.btGEN_List_addTail(swigCPtr, this, btGEN_Link.getCPtr(link), link);
  }

}
