// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

import scala.collection.JavaConverters._

/** @param messageSetWireFormat
  *   Set true to use the old proto1 MessageSet wire format for extensions.
  *   This is provided for backwards-compatibility with the MessageSet wire
  *   format.  You should not use this for any other reason:  It's less
  *   efficient, has fewer features, and is more complicated.
  *  
  *   The message must be defined exactly as follows:
  *     message Foo {
  *       option message_set_wire_format = true;
  *       extensions 4 to max;
  *     }
  *   Note that the message cannot have any defined fields; MessageSets only
  *   have extensions.
  *  
  *   All extensions of your type must be singular messages; e.g. they cannot
  *   be int32s, enums, or repeated messages.
  *  
  *   Because this is an option, the above two restrictions are not enforced by
  *   the protocol compiler.
  * @param noStandardDescriptorAccessor
  *   Disables the generation of the standard "descriptor()" accessor, which can
  *   conflict with a field of the same name.  This is meant to make migration
  *   from proto1 easier; new code should avoid fields named "descriptor".
  * @param deprecated
  *   Is this message deprecated?
  *   Depending on the target platform, this can emit Deprecated annotations
  *   for the message, or it will be completely ignored; in the very least,
  *   this is a formalization for deprecating messages.
  * @param mapEntry
  *   Whether the message is an automatically generated map entry type for the
  *   maps field.
  *  
  *   For maps fields:
  *       map&lt;KeyType, ValueType&gt; map_field = 1;
  *   The parsed descriptor looks like:
  *       message MapFieldEntry {
  *           option map_entry = true;
  *           optional KeyType key = 1;
  *           optional ValueType value = 2;
  *       }
  *       repeated MapFieldEntry map_field = 1;
  *  
  *   Implementations may choose not to generate the map_entry=true message, but
  *   use a native map in the target language to hold the keys and values.
  *   The reflection APIs in such implementions still need to work as
  *   if the field is a repeated message field.
  *  
  *   NOTE: Do not set the option in .proto files. Always use the maps syntax
  *   instead. The option should only be implicitly set by the proto compiler
  *   parser.
  * @param uninterpretedOption
  *   The parser stores options it doesn't recognize here. See above.
  */
@SerialVersionUID(0L)
final case class MessageOptions(
    messageSetWireFormat: scala.Option[Boolean] = None,
    noStandardDescriptorAccessor: scala.Option[Boolean] = None,
    deprecated: scala.Option[Boolean] = None,
    mapEntry: scala.Option[Boolean] = None,
    uninterpretedOption: _root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption] = _root_.scala.collection.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet()
    ) extends scalapb.GeneratedMessage with scalapb.Message[MessageOptions] with scalapb.lenses.Updatable[MessageOptions] with _root_.scalapb.ExtendableMessage[MessageOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (messageSetWireFormat.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(1, messageSetWireFormat.get) }
      if (noStandardDescriptorAccessor.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, noStandardDescriptorAccessor.get) }
      if (deprecated.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, deprecated.get) }
      if (mapEntry.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(7, mapEntry.get) }
      uninterpretedOption.foreach(uninterpretedOption => __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(uninterpretedOption.serializedSize) + uninterpretedOption.serializedSize)
      __size += unknownFields.serializedSize
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      messageSetWireFormat.foreach { __v =>
        _output__.writeBool(1, __v)
      };
      noStandardDescriptorAccessor.foreach { __v =>
        _output__.writeBool(2, __v)
      };
      deprecated.foreach { __v =>
        _output__.writeBool(3, __v)
      };
      mapEntry.foreach { __v =>
        _output__.writeBool(7, __v)
      };
      uninterpretedOption.foreach { __v =>
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.MessageOptions = {
      var __messageSetWireFormat = this.messageSetWireFormat
      var __noStandardDescriptorAccessor = this.noStandardDescriptorAccessor
      var __deprecated = this.deprecated
      var __mapEntry = this.mapEntry
      val __uninterpretedOption = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption] ++= this.uninterpretedOption)
      val _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(this.unknownFields)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __messageSetWireFormat = Some(_input__.readBool())
          case 16 =>
            __noStandardDescriptorAccessor = Some(_input__.readBool())
          case 24 =>
            __deprecated = Some(_input__.readBool())
          case 56 =>
            __mapEntry = Some(_input__.readBool())
          case 7994 =>
            __uninterpretedOption += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.UninterpretedOption.defaultInstance)
          case tag => _unknownFields__.parseField(tag, _input__)
        }
      }
      com.google.protobuf.descriptor.MessageOptions(
          messageSetWireFormat = __messageSetWireFormat,
          noStandardDescriptorAccessor = __noStandardDescriptorAccessor,
          deprecated = __deprecated,
          mapEntry = __mapEntry,
          uninterpretedOption = __uninterpretedOption.result(),
          unknownFields = _unknownFields__.result()
      )
    }
    def getMessageSetWireFormat: Boolean = messageSetWireFormat.getOrElse(false)
    def clearMessageSetWireFormat: MessageOptions = copy(messageSetWireFormat = None)
    def withMessageSetWireFormat(__v: Boolean): MessageOptions = copy(messageSetWireFormat = Some(__v))
    def getNoStandardDescriptorAccessor: Boolean = noStandardDescriptorAccessor.getOrElse(false)
    def clearNoStandardDescriptorAccessor: MessageOptions = copy(noStandardDescriptorAccessor = None)
    def withNoStandardDescriptorAccessor(__v: Boolean): MessageOptions = copy(noStandardDescriptorAccessor = Some(__v))
    def getDeprecated: Boolean = deprecated.getOrElse(false)
    def clearDeprecated: MessageOptions = copy(deprecated = None)
    def withDeprecated(__v: Boolean): MessageOptions = copy(deprecated = Some(__v))
    def getMapEntry: Boolean = mapEntry.getOrElse(false)
    def clearMapEntry: MessageOptions = copy(mapEntry = None)
    def withMapEntry(__v: Boolean): MessageOptions = copy(mapEntry = Some(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = _root_.scala.collection.Seq.empty)
    def addUninterpretedOption(__vs: com.google.protobuf.descriptor.UninterpretedOption*): MessageOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: TraversableOnce[com.google.protobuf.descriptor.UninterpretedOption]): MessageOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: _root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]): MessageOptions = copy(uninterpretedOption = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => messageSetWireFormat.orNull
        case 2 => noStandardDescriptorAccessor.orNull
        case 3 => deprecated.orNull
        case 7 => mapEntry.orNull
        case 999 => uninterpretedOption
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => messageSetWireFormat.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => noStandardDescriptorAccessor.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => deprecated.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => mapEntry.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 999 => _root_.scalapb.descriptors.PRepeated(uninterpretedOption.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.MessageOptions
}

object MessageOptions extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MessageOptions] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MessageOptions, com.google.protobuf.DescriptorProtos.MessageOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MessageOptions] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MessageOptions, com.google.protobuf.DescriptorProtos.MessageOptions] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.MessageOptions): com.google.protobuf.DescriptorProtos.MessageOptions = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder
    scalaPbSource.messageSetWireFormat.foreach(javaPbOut.setMessageSetWireFormat)
    scalaPbSource.noStandardDescriptorAccessor.foreach(javaPbOut.setNoStandardDescriptorAccessor)
    scalaPbSource.deprecated.foreach(javaPbOut.setDeprecated)
    scalaPbSource.mapEntry.foreach(javaPbOut.setMapEntry)
    javaPbOut.addAllUninterpretedOption(scalaPbSource.uninterpretedOption.map(com.google.protobuf.descriptor.UninterpretedOption.toJavaProto)(_root_.scala.collection.breakOut).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.MessageOptions): com.google.protobuf.descriptor.MessageOptions = com.google.protobuf.descriptor.MessageOptions(
    messageSetWireFormat = if (javaPbSource.hasMessageSetWireFormat) Some(javaPbSource.getMessageSetWireFormat.booleanValue) else None,
    noStandardDescriptorAccessor = if (javaPbSource.hasNoStandardDescriptorAccessor) Some(javaPbSource.getNoStandardDescriptorAccessor.booleanValue) else None,
    deprecated = if (javaPbSource.hasDeprecated) Some(javaPbSource.getDeprecated.booleanValue) else None,
    mapEntry = if (javaPbSource.hasMapEntry) Some(javaPbSource.getMapEntry.booleanValue) else None,
    uninterpretedOption = javaPbSource.getUninterpretedOptionList.asScala.map(com.google.protobuf.descriptor.UninterpretedOption.fromJavaProto)(_root_.scala.collection.breakOut)
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.MessageOptions = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.MessageOptions(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.getOrElse(__fields.get(4), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.MessageOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.MessageOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[scala.Option[Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(10)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(10)
  def messageCompanionForFieldNumber(__number: Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 999 => __out = com.google.protobuf.descriptor.UninterpretedOption
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.MessageOptions(
  )
  implicit class MessageOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MessageOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.MessageOptions](_l) {
    def messageSetWireFormat: _root_.scalapb.lenses.Lens[UpperPB, Boolean] = field(_.getMessageSetWireFormat)((c_, f_) => c_.copy(messageSetWireFormat = Some(f_)))
    def optionalMessageSetWireFormat: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.messageSetWireFormat)((c_, f_) => c_.copy(messageSetWireFormat = f_))
    def noStandardDescriptorAccessor: _root_.scalapb.lenses.Lens[UpperPB, Boolean] = field(_.getNoStandardDescriptorAccessor)((c_, f_) => c_.copy(noStandardDescriptorAccessor = Some(f_)))
    def optionalNoStandardDescriptorAccessor: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.noStandardDescriptorAccessor)((c_, f_) => c_.copy(noStandardDescriptorAccessor = f_))
    def deprecated: _root_.scalapb.lenses.Lens[UpperPB, Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Some(f_)))
    def optionalDeprecated: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def mapEntry: _root_.scalapb.lenses.Lens[UpperPB, Boolean] = field(_.getMapEntry)((c_, f_) => c_.copy(mapEntry = Some(f_)))
    def optionalMapEntry: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.mapEntry)((c_, f_) => c_.copy(mapEntry = f_))
    def uninterpretedOption: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1
  final val NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2
  final val DEPRECATED_FIELD_NUMBER = 3
  final val MAP_ENTRY_FIELD_NUMBER = 7
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
}
