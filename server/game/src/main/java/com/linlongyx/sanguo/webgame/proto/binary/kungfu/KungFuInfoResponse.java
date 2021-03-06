/*    */ package com.linlongyx.sanguo.webgame.proto.binary.kungfu;
/*    */ 
/*    */ import com.linlongyx.core.framework.protocol.ResponseBase;
/*    */ import com.linlongyx.sanguo.webgame.proto.ProtocolUtil;
/*    */ import com.linlongyx.sanguo.webgame.proto.binary.struct.KungFuData;
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
/*    */ public class KungFuInfoResponse
/*    */   extends ResponseBase
/*    */ {
/* 20 */   public ArrayList<KungFuData> list = new ArrayList<>();
/*    */   
/*    */   public KungFuInfoResponse() {
/* 23 */     this.eventResponseId = 25601;
/* 24 */     this.codeType = 2;
/*    */   }
/*    */   
/*    */   public KungFuInfoResponse(short retCode) {
/* 28 */     this.eventResponseId = 25601;
/* 29 */     this.codeType = 2;
/* 30 */     this.retCode = retCode;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void serial(ByteBuf out) {
/* 36 */     int size_0 = this.list.size();
/* 37 */     ProtocolUtil.writeStrArraySize(out, size_0);
/* 38 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 40 */       KungFuData tmp_0 = this.list.get(index_0);
/* 41 */       tmp_0.serial(out);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void unserial(ByteBuf in) {
/* 48 */     int size_0 = ProtocolUtil.readStrArraySize(in);
/* 49 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 51 */       KungFuData tmp_0 = new KungFuData();
/* 52 */       tmp_0.unserial(in);
/* 53 */       this.list.add(tmp_0);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public KungFuInfoResponse clone() throws CloneNotSupportedException {
/* 59 */     KungFuInfoResponse clone = (KungFuInfoResponse)super.clone();
/* 60 */     int size_0 = this.list.size();
/* 61 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 63 */       KungFuData tmp_0 = this.list.get(index_0);
/* 64 */       clone.list.add(tmp_0.clone());
/*    */     } 
/* 66 */     return clone;
/*    */   }
/*    */ 
/*    */   
/*    */   public void reset() {
/* 71 */     this.list.clear();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 76 */     String retVal = "{\"list\":" + this.list.toString() + "}";
/* 77 */     return retVal;
/*    */   }
/*    */ }


/* Location:              D:\xxsg_52gmsy\game\target\classes\!\com\linlongyx\sanguo\webgame\proto\binary\kungfu\KungFuInfoResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */