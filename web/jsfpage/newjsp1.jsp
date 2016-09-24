<%-- 
    Document   : newjsp1
    Created on : Aug 9, 2016, 9:16:18 PM
    Author     : Rabiul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div>
            
               <h:form>
            <table>
                <tr>
                    <td>Notice Serial</td>
                     <td>Class Susspend Notice</td>
                    <td>Exam Notice</td>
                    <td>Recent Impotant Notice</td>
                    <td>Date</td>
                    
                </tr>
                <tr>
                   
                    <td><h:inputText value="${notice.id}"/></td>
                    <td><h:inputTextarea value="${notice.classSuuspendNotice}"/></td>
                    <td><h:inputTextarea value="${notice.examNotice}"/></td>
                    <td><h:inputTextarea value="${notice.rcenImportentNotice}"/></td>
                     <td><h:inputText value="${notice.date}"/></td>
                </tr>
               
               
                   
               
            </table>
               <h:outputLabel value="${notice.rightMsg}"/>
               <h:outputLabel value="${notice.wrmas}"/>
               <h:commandButton value="Submit" action="${notice.doSave()}"/>
        </h:form>
        </div>
        <div>
        <h:form>

            <table>
                <tr>
                    <td>Notice Serial</td>
                     <td>Class Susspend Notice</td>
                     <td>Exam Notice</td>
                      <td>Recent Impotant Notice</td>
                    <td>Slelcet Date</td>
                   
                </tr>
                <tr>
                    
                    
                    <td><h:inputText value="${notice.id}" id="a"/></td>
                    <td><h:inputTextarea value="${notice.classSuuspendNotice}" id="b"/></td>
                    <td><h:inputTextarea value="${notice.examNotice}" id="c"/></td>
                    <td><h:inputTextarea value="${notice.rcenImportentNotice}" id="d"/></td>
                     <td> <h:selectOneMenu value="${notice.selectDate}"> 
                            <f:selectItems  value="${notice.load}" />
                            <f:ajax render="a b c d" event="change" listener="${notice.allChange()}"/>
                        </h:selectOneMenu>  

                    </td>
                </tr>
            
               
                </table>

            <h:commandButton value="Update" action="${notice.doUpdate()}"/>

        </h:form>
            </div>
        <div>
        <h:form>

            <table>
                <tr>
                    <td>Notice Serial</td>
                     <td>Class Susspend Notice</td>
                     <td>Exam Notice</td>
                      <td>Recent Impotant Notice</td>
                    <td>Slelcet Date</td>
                   
                </tr>
                <tr>
                    
                    
                    <td><h:inputText value="${notice.id}" id="a"/></td>
                    <td><h:inputTextarea value="${notice.classSuuspendNotice}" id="b"/></td>
                    <td><h:inputTextarea value="${notice.examNotice}" id="c"/></td>
                    <td><h:inputTextarea value="${notice.rcenImportentNotice}" id="d"/></td>
                     <td> <h:selectOneMenu value="${notice.selectDate}"> 
                            <f:selectItems  value="${notice.load}" />
                            <f:ajax render="a b c d" event="change" listener="${notice.allChange()}"/>
                        </h:selectOneMenu>  

                    </td>
                </tr>
            
               
                </table>

            <h:commandButton value="Delete" action="${notice.doDelete()}"/>

        </h:form>
            </div>
    </body>
</html>
