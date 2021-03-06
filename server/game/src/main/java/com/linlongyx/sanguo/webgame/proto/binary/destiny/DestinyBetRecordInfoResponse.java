/*    */ package com.linlongyx.sanguo.webgame.proto.binary.destiny;
/*    */ 
/*    */ import com.linlongyx.core.framework.protocol.ResponseBase;
/*    */ import com.linlongyx.sanguo.webgame.proto.ProtocolUtil;
/*    */ import com.linlongyx.sanguo.webgame.proto.binary.struct.DestinyBetRecord;
/*    */ import io.netty.buffer.ByteBuf;
/*    */ import java.util.ArrayList;
/*    */ import org.msgpack.annotation.Message;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Message
/*    */ public class DestinyBetRecordInfoResponse
/*    */   extends ResponseBase
/*    */ {
/* 20 */   public ArrayList<DestinyBetRecord> recordList = new ArrayList<>();
/*    */   
/*    */   public DestinyBetRecordInfoResponse() {
/* 23 */     this.eventResponseId = 27414;
/* 24 */     this.codeType = 2;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void serial(ByteBuf out) {
/* 30 */     int size_0 = this.recordList.size();
/* 31 */     ProtocolUtil.writeStrArraySize(out, size_0);
/* 32 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 34 */       DestinyBetRecord tmp_0 = this.recordList.get(index_0);
/* 35 */       tmp_0.serial(out);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void unserial(ByteBuf in) {
/* 42 */     int size_0 = ProtocolUtil.readStrArraySize(in);
/* 43 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 45 */       DestinyBetRecord tmp_0 = new DestinyBetRecord();
/* 46 */       tmp_0.unserial(in);
/* 47 */       this.recordList.add(tmp_0);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public DestinyBetRecordInfoResponse clone() throws CloneNotSupportedException {
/* 53 */     DestinyBetRecordInfoResponse clone = (DestinyBetRecordInfoResponse)super.clone();
/* 54 */     int size_0 = this.recordList.size();
/* 55 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 57 */       DestinyBetRecord tmp_0 = this.recordList.get(index_0);
/* 58 */       clone.recordList.add(tmp_0.clone());
/*    */     } 
/* 60 */     return clone;
/*    */   }
/*    */ 
/*    */   
/*    */   public void reset() {
/* 65 */     this.recordList.clear();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 70 */     String retVal = "{\"recordList\":" + this.recordList.toString() + "}";
/* 71 */     return retVal;
/*    */   }
/*    */ }


/* Location:              D:\xxsg_52gmsy\game\target\classes\!\com\linlongyx\sanguo\webgame\proto\binary\destiny\DestinyBetRecordInfoResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */