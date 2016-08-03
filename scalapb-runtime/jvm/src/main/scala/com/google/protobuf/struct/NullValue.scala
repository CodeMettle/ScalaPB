// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.struct

import scala.collection.JavaConversions._

sealed trait NullValue extends com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = NullValue
  def isNullValue: Boolean = false
  def isUnrecognized: Boolean = false
  def companion: com.trueaccord.scalapb.GeneratedEnumCompanion[NullValue] = NullValue
}

object NullValue extends com.trueaccord.scalapb.GeneratedEnumCompanion[NullValue] {
  implicit def enumCompanion: com.trueaccord.scalapb.GeneratedEnumCompanion[NullValue] = this
  @SerialVersionUID(0L)
  case object NULL_VALUE extends NullValue {
    val value = 0
    val index = 0
    val name = "NULL_VALUE"
    override def isNullValue: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends NullValue {
    val name = "UNRECOGNIZED"
    val index = -1
    override def isUnrecognized: Boolean = true
  }
  
  lazy val values = scala.collection.Seq(NULL_VALUE)
  def fromValue(value: Int): NullValue = value match {
    case 0 => NULL_VALUE
    case __other => Unrecognized(__other)
  }
  def descriptor: com.google.protobuf.Descriptors.EnumDescriptor = StructProto.descriptor.getEnumTypes.get(0)
  def fromJavaValue(pbJavaSource: com.google.protobuf.NullValue): NullValue = fromValue(pbJavaSource.getNumber)
  def toJavaValue(pbScalaSource: NullValue): com.google.protobuf.NullValue = com.google.protobuf.NullValue.forNumber(pbScalaSource.value)
}