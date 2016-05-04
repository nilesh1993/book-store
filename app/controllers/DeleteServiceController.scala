package controllers

import java.net.URI

import com.marklogic.xcc.{ResultSequence, Session, ContentSourceFactory}

/**
 * Created by njm1688 on 4/29/16.
 */
class DeleteServiceController {

  def delete(bookId:String,dropdownValue:String)={

    val uri :URI = new URI("xcc://admin:admin@localhost:8050/bookStore");
    val contentSource = ContentSourceFactory.newContentSource(uri);
    val session = contentSource.newSession();
    val drop="$book//"+dropdownValue+""

    session.setTransactionMode(Session.TransactionMode.UPDATE);
    //val rs2=session.submitRequest(session.newAdhocQuery("doc('catalogg.xml')"))
    //val rs3=session.submitRequest(session.newAdhocQuery("cts:search(//Book, cts:element-value-query(xs:QName(\"" + dropdownValue.toList.head+ "\"), \"" + bookId.toList.head + "\"))"))
    //val rs =session.submitRequest(session.newAdhocQuery("for $book in doc('catalogg.xml')//Book where $book//bookId = (\""+bookId+"\") return ($book//bookName)"))
    //val rs1=session.submitRequest(session.newAdhocQuery("xdmp:node-delete((\""+rs2.asString()+"\")/\""+rs3.asString()+"\")"))
    //println("rs2==========="+rs2.asString())
    //println("hello")
    val request = session.newAdhocQuery("let $doc := doc('catalogg.xml')\n\nlet $result := for $book in $doc//Book\n                  where "+drop+" = \""+bookId+"\"\n                  return $book\n                  \nlet $node := xdmp:node-delete($doc//$result)\n\nreturn $node")
    println("Request : ", request.getQuery.toString)
    val finaldelete=session.submitRequest(request)

    //println("rs============"+finaldelete.asString())

    //val rs=session.submitRequest(session.newAdhocQuery("xdmp:document-delete('catalogg.xml')"));
    session.commit();
    session.close();

  }



}
