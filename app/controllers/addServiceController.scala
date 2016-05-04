package controllers

import java.net.URI

import com.marklogic.xcc.{Session, ContentSourceFactory}

/**
 * Created by njm1688 on 4/28/16.
 */
class addServiceController() {

  def add(bookId:String,bookName:String,bookAuthor:String)={

    val uri: URI = new URI("xcc://admin:admin@localhost:8050/bookStore");
    val contentSource = ContentSourceFactory.newContentSource(uri);
    val session = contentSource.newSession();
    //println("BookId in service--------"+bookId)

    session.setTransactionMode(Session.TransactionMode.UPDATE);
    //println("In Addservice")
    val rs=session.submitRequest(session.newAdhocQuery("xdmp:node-insert-child(doc('catalogg.xml')/BookStore,<Book><bookId>"+bookId+"</bookId><bookName>"+bookName+"</bookName><bookAuthor>"+bookAuthor+"</bookAuthor></Book>)"))
    session.commit();
    session.close();
  }

}
