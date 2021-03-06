/*
 * THIS FILE WAS AUTOGENERATED BY THE DIGITAL ASSET DAML SCALA CODE GENERATOR
 * DO NOT EDIT BY HAND!
 */
import _root_.com.digitalasset.ledger.client.{binding=>$u0020lfdomainapi}
import _root_.com.digitalasset.ledger.api.v1.{value=>$u0020rpcvalue}
package com.knoldus {
  package Main {
    final case class AcceptRequest(requestId: ` lfdomainapi`.Primitive.ContractId[com.knoldus.Main.ShareRequest]) extends ` lfdomainapi`.ValueRef

    object AcceptRequest extends ` lfdomainapi`.ValueRefCompanion with _root_.scala.Function1[` lfdomainapi`.Primitive.ContractId[com.knoldus.Main.ShareRequest], _root_.com.knoldus.Main.AcceptRequest] {
      import _root_.scala.language.higherKinds;
      trait view[` C`[_]] extends ` lfdomainapi`.encoding.RecordView[` C`, view] { $u0020view =>
        val requestId: ` C`[` lfdomainapi`.Primitive.ContractId[com.knoldus.Main.ShareRequest]];
        final override def hoist[` D`[_]](` f` : _root_.scalaz.~>[` C`, ` D`]): view[` D`] = {
          final class $anon extends _root_.scala.AnyRef with view[` D`] {
            override val requestId = ` f`(` view`.requestId)
          };
          new $anon()
        }
      };
      implicit val `AcceptRequest Value`: ` lfdomainapi`.Value[_root_.com.knoldus.Main.AcceptRequest] = {
        final class $anon extends this.`Value ValueRef`[_root_.com.knoldus.Main.AcceptRequest] {
          override def write(value: _root_.com.knoldus.Main.AcceptRequest): ` rpcvalue`.Value.Sum = ` record`(scala.Tuple2("requestId", ` lfdomainapi`.Value.encode(value.requestId)));
          override def read(argValue: ` rpcvalue`.Value.Sum): _root_.scala.Option[_root_.com.knoldus.Main.AcceptRequest] = argValue.record.flatMap(((` r` ) => if (` r`.fields.length.==(1))
            ` r`.fields(0) match {
              case ` rpcvalue`.RecordField((""| "requestId"), _root_.scala.Some(zv0)) => (` lfdomainapi`.Value.decode[` lfdomainapi`.Primitive.ContractId[com.knoldus.Main.ShareRequest]](zv0) match {
                case _root_.scala.Some(requestId) => Some(AcceptRequest(requestId))
                case _root_.scala.None => _root_.scala.None
              })
              case _ => _root_.scala.None
            }
          else
            _root_.scala.None))
        };
        new $anon()
      };
      override protected val ` dataTypeId` = ` mkDataTypeId`(`Package IDs`.Main, "Main", "AcceptRequest");
      implicit def `AcceptRequest LfEncodable`: ` lfdomainapi`.encoding.LfEncodable[_root_.com.knoldus.Main.AcceptRequest] = {
        final class $anon extends ` lfdomainapi`.encoding.LfEncodable[_root_.com.knoldus.Main.AcceptRequest] {
          override def encoding(lte: ` lfdomainapi`.encoding.LfTypeEncoding): lte.Out[_root_.com.knoldus.Main.AcceptRequest] = {
            object `view ` extends view[lte.Field] {
              val requestId = lte.field("requestId", ` lfdomainapi`.encoding.LfEncodable.encoding[` lfdomainapi`.Primitive.ContractId[com.knoldus.Main.ShareRequest]](lte))
            };
            {
              val `recordFields `: lte.RecordFields[_root_.com.knoldus.Main.AcceptRequest] = lte.RecordFields.xmapN(lte.fields(`view `.requestId))({
                case requestId => _root_.com.knoldus.Main.AcceptRequest(requestId)
              })({
                case _root_.com.knoldus.Main.AcceptRequest(requestId) => requestId
              });
              lte.record(` dataTypeId`, `recordFields `)
            }
          }
        };
        new $anon()
      }
    }
  }
}
