<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://xmlns.oracle.com/adf/faces/rich" prefix="af"%>
<%@ taglib uri="http://xmlns.oracle.com/dss/adf/faces" prefix="dvt"%>
<f:view>
  <af:document id="d1">
    <af:messages id="m1"/>
    <af:form id="f1">
      <af:panelStretchLayout id="psl1">
        <f:facet name="center">
          <af:panelSplitter id="ps1" splitterPosition="201">
            <f:facet name="first">
              <af:panelAccordion id="pa1">
                <af:showDetailItem text="Dept" id="sdi2">
                  <af:panelFormLayout id="pfl1">
                    <af:panelLabelAndMessage label="#{bindings.DepartmentId.hints.label}"
                                             id="plam1">
                      <af:outputText value="#{bindings.DepartmentId.inputValue}"
                                     id="ot4">
                        <af:convertNumber groupingUsed="false"
                                          pattern="#{bindings.DepartmentId.format}"/>
                      </af:outputText>
                    </af:panelLabelAndMessage>
                    <af:panelLabelAndMessage label="#{bindings.DepartmentName.hints.label}"
                                             id="plam4">
                      <af:outputText value="#{bindings.DepartmentName.inputValue}"
                                     id="ot2"/>
                    </af:panelLabelAndMessage>
                    <af:panelLabelAndMessage label="#{bindings.ManagerId.hints.label}"
                                             id="plam3">
                      <af:outputText value="#{bindings.ManagerId.inputValue}"
                                     id="ot3">
                        <af:convertNumber groupingUsed="false"
                                          pattern="#{bindings.ManagerId.format}"/>
                      </af:outputText>
                    </af:panelLabelAndMessage>
                    <af:panelLabelAndMessage label="#{bindings.LocationId.hints.label}"
                                             id="plam2">
                      <af:outputText value="#{bindings.LocationId.inputValue}"
                                     id="ot1">
                        <af:convertNumber groupingUsed="false"
                                          pattern="#{bindings.LocationId.format}"/>
                      </af:outputText>
                    </af:panelLabelAndMessage>
                    <f:facet name="footer">
                      <af:panelGroupLayout layout="horizontal" id="pgl1">
                        <af:commandButton actionListener="#{bindings.First.execute}"
                                          text="First"
                                          disabled="#{!bindings.First.enabled}"
                                          partialSubmit="true" id="cb1"/>
                        <af:commandButton actionListener="#{bindings.Previous.execute}"
                                          text="Previous"
                                          disabled="#{!bindings.Previous.enabled}"
                                          partialSubmit="true" id="cb2"/>
                        <af:commandButton actionListener="#{bindings.Next.execute}"
                                          text="Next"
                                          disabled="#{!bindings.Next.enabled}"
                                          partialSubmit="true" id="cb4"/>
                        <af:commandButton actionListener="#{bindings.Last.execute}"
                                          text="Last"
                                          disabled="#{!bindings.Last.enabled}"
                                          partialSubmit="true" id="cb3"/>
                      </af:panelGroupLayout>
                    </f:facet>
                  </af:panelFormLayout>
                </af:showDetailItem>
                <af:showDetailItem text="More Info" id="sdi3">
                  <af:region value="#{bindings.Helloflow1.regionModel}"
                             id="r1"/>
                </af:showDetailItem>
              </af:panelAccordion>
            </f:facet>
            <f:facet name="second">
              <af:panelSplitter id="ps2" orientation="vertical">
                <f:facet name="first">
                  <af:panelCollection id="pc1">
                    <f:facet name="menus"/>
                    <f:facet name="toolbar"/>
                    <f:facet name="statusbar"/>
                    <af:table value="#{bindings.EmployeesView3.collectionModel}"
                              var="row"
                              rows="#{bindings.EmployeesView3.rangeSize}"
                              emptyText="#{bindings.EmployeesView3.viewable ? 'No data to display.' : 'Access Denied.'}"
                              fetchSize="#{bindings.EmployeesView3.rangeSize}"
                              rowBandingInterval="0"
                              filterModel="#{bindings.EmployeesView3Query.queryDescriptor}"
                              queryListener="#{bindings.EmployeesView3Query.processQuery}"
                              filterVisible="true" varStatus="vs"
                              selectedRowKeys="#{bindings.EmployeesView3.collectionModel.selectedRow}"
                              selectionListener="#{bindings.EmployeesView3.collectionModel.makeCurrent}"
                              rowSelection="single" id="t1"
                              columnSelection="single">
                      <af:column sortProperty="FirstName" filterable="true"
                                 sortable="true"
                                 headerText="#{bindings.EmployeesView3.hints.FirstName.label}"
                                 id="c1">
                        <af:outputText value="#{row.FirstName}" id="ot7"/>
                      </af:column>
                      <af:column sortProperty="LastName" filterable="true"
                                 sortable="true"
                                 headerText="#{bindings.EmployeesView3.hints.LastName.label}"
                                 id="c4">
                        <af:outputText value="#{row.LastName}" id="ot6"/>
                      </af:column>
                      <af:column sortProperty="Email" filterable="true"
                                 sortable="true"
                                 headerText="#{bindings.EmployeesView3.hints.Email.label}"
                                 id="c9">
                        <af:outputText value="#{row.Email}" id="ot8"/>
                      </af:column>
                      <af:column sortProperty="PhoneNumber" filterable="true"
                                 sortable="true"
                                 headerText="#{bindings.EmployeesView3.hints.PhoneNumber.label}"
                                 id="c2">
                        <af:outputText value="#{row.PhoneNumber}" id="ot14"/>
                      </af:column>
                      <af:column sortProperty="HireDate" filterable="true"
                                 sortable="true"
                                 headerText="#{bindings.EmployeesView3.hints.HireDate.label}"
                                 id="c6">
                        <f:facet name="filter">
                          <af:inputDate value="#{vs.filterCriteria.HireDate}"
                                        id="id1"/>
                        </f:facet>
                        <af:outputText value="#{row.HireDate}" id="ot9">
                          <af:convertDateTime pattern="#{bindings.EmployeesView3.hints.HireDate.format}"/>
                        </af:outputText>
                      </af:column>
                      <af:column sortProperty="JobId" filterable="true"
                                 sortable="true"
                                 headerText="#{bindings.EmployeesView3.hints.JobId.label}"
                                 id="c3">
                        <af:outputText value="#{row.JobId}" id="ot5"/>
                      </af:column>
                      <af:column sortProperty="Salary" filterable="true"
                                 sortable="true"
                                 headerText="#{bindings.EmployeesView3.hints.Salary.label}"
                                 id="c7">
                        <af:outputText value="#{row.Salary}" id="ot10">
                          <af:convertNumber groupingUsed="false"
                                            pattern="#{bindings.EmployeesView3.hints.Salary.format}"/>
                        </af:outputText>
                      </af:column>
                      <af:column sortProperty="CommissionPct" filterable="true"
                                 sortable="true"
                                 headerText="#{bindings.EmployeesView3.hints.CommissionPct.label}"
                                 id="c10">
                        <af:outputText value="#{row.CommissionPct}" id="ot11">
                          <af:convertNumber groupingUsed="false"
                                            pattern="#{bindings.EmployeesView3.hints.CommissionPct.format}"/>
                        </af:outputText>
                      </af:column>
                      <af:column sortProperty="ManagerId" filterable="true"
                                 sortable="true"
                                 headerText="#{bindings.EmployeesView3.hints.ManagerId.label}"
                                 id="c8">
                        <af:outputText value="#{row.ManagerId}" id="ot12">
                          <af:convertNumber groupingUsed="false"
                                            pattern="#{bindings.EmployeesView3.hints.ManagerId.format}"/>
                        </af:outputText>
                      </af:column>
                      <af:column sortProperty="DepartmentId" filterable="true"
                                 sortable="true"
                                 headerText="#{bindings.EmployeesView3.hints.DepartmentId.label}"
                                 id="c5">
                        <af:outputText value="#{row.DepartmentId}" id="ot13">
                          <af:convertNumber groupingUsed="false"
                                            pattern="#{bindings.EmployeesView3.hints.DepartmentId.format}"/>
                        </af:outputText>
                      </af:column>
                    </af:table>
                  </af:panelCollection>
                </f:facet>
                <f:facet name="second">
                  <af:panelTabbed id="pt1">
                    <af:showDetailItem text="Employee" id="sdi1">
                      <af:panelFormLayout id="pfl2">
                        <af:inputText value="#{bindings.EmployeeId.inputValue}"
                                      label="#{bindings.EmployeeId.hints.label}"
                                      required="#{bindings.EmployeeId.hints.mandatory}"
                                      columns="#{bindings.EmployeeId.hints.displayWidth}"
                                      maximumLength="#{bindings.EmployeeId.hints.precision}"
                                      shortDesc="#{bindings.EmployeeId.hints.tooltip}"
                                      id="it6">
                          <f:validator binding="#{bindings.EmployeeId.validator}"/>
                          <af:convertNumber groupingUsed="false"
                                            pattern="#{bindings.EmployeeId.format}"/>
                        </af:inputText>
                        <af:inputText value="#{bindings.FirstName.inputValue}"
                                      label="#{bindings.FirstName.hints.label}"
                                      required="#{bindings.FirstName.hints.mandatory}"
                                      columns="#{bindings.FirstName.hints.displayWidth}"
                                      maximumLength="#{bindings.FirstName.hints.precision}"
                                      shortDesc="#{bindings.FirstName.hints.tooltip}"
                                      id="it1">
                          <f:validator binding="#{bindings.FirstName.validator}"/>
                        </af:inputText>
                        <af:inputText value="#{bindings.LastName.inputValue}"
                                      label="#{bindings.LastName.hints.label}"
                                      required="#{bindings.LastName.hints.mandatory}"
                                      columns="#{bindings.LastName.hints.displayWidth}"
                                      maximumLength="#{bindings.LastName.hints.precision}"
                                      shortDesc="#{bindings.LastName.hints.tooltip}"
                                      id="it3">
                          <f:validator binding="#{bindings.LastName.validator}"/>
                        </af:inputText>
                        <af:inputText value="#{bindings.Email.inputValue}"
                                      label="#{bindings.Email.hints.label}"
                                      required="#{bindings.Email.hints.mandatory}"
                                      columns="#{bindings.Email.hints.displayWidth}"
                                      maximumLength="#{bindings.Email.hints.precision}"
                                      shortDesc="#{bindings.Email.hints.tooltip}"
                                      id="it8">
                          <f:validator binding="#{bindings.Email.validator}"/>
                        </af:inputText>
                        <af:inputText value="#{bindings.PhoneNumber.inputValue}"
                                      label="#{bindings.PhoneNumber.hints.label}"
                                      required="#{bindings.PhoneNumber.hints.mandatory}"
                                      columns="#{bindings.PhoneNumber.hints.displayWidth}"
                                      maximumLength="#{bindings.PhoneNumber.hints.precision}"
                                      shortDesc="#{bindings.PhoneNumber.hints.tooltip}"
                                      id="it9">
                          <f:validator binding="#{bindings.PhoneNumber.validator}"/>
                        </af:inputText>
                        <af:inputDate value="#{bindings.HireDate.inputValue}"
                                      label="#{bindings.HireDate.hints.label}"
                                      required="#{bindings.HireDate.hints.mandatory}"
                                      shortDesc="#{bindings.HireDate.hints.tooltip}"
                                      id="id2">
                          <f:validator binding="#{bindings.HireDate.validator}"/>
                          <af:convertDateTime pattern="#{bindings.HireDate.format}"/>
                        </af:inputDate>
                        <af:inputComboboxListOfValues id="jobIdId"
                                                      popupTitle="Search and Select: #{bindings.JobId.hints.label}"
                                                      value="#{bindings.JobId.inputValue}"
                                                      label="#{bindings.JobId.hints.label}"
                                                      model="#{bindings.JobId.listOfValuesModel}"
                                                      required="#{bindings.JobId.hints.mandatory}"
                                                      columns="#{bindings.JobId.hints.displayWidth}"
                                                      shortDesc="#{bindings.JobId.hints.tooltip}">
                          <f:validator binding="#{bindings.JobId.validator}"/>
                        </af:inputComboboxListOfValues>
                        <af:inputText value="#{bindings.Salary.inputValue}"
                                      label="#{bindings.Salary.hints.label}"
                                      required="#{bindings.Salary.hints.mandatory}"
                                      columns="#{bindings.Salary.hints.displayWidth}"
                                      maximumLength="#{bindings.Salary.hints.precision}"
                                      shortDesc="#{bindings.Salary.hints.tooltip}"
                                      id="it4">
                          <f:validator binding="#{bindings.Salary.validator}"/>
                          <af:convertNumber groupingUsed="false"
                                            pattern="#{bindings.Salary.format}"/>
                        </af:inputText>
                        <af:inputText value="#{bindings.CommissionPct.inputValue}"
                                      label="#{bindings.CommissionPct.hints.label}"
                                      required="#{bindings.CommissionPct.hints.mandatory}"
                                      columns="#{bindings.CommissionPct.hints.displayWidth}"
                                      maximumLength="#{bindings.CommissionPct.hints.precision}"
                                      shortDesc="#{bindings.CommissionPct.hints.tooltip}"
                                      id="it2">
                          <f:validator binding="#{bindings.CommissionPct.validator}"/>
                          <af:convertNumber groupingUsed="false"
                                            pattern="#{bindings.CommissionPct.format}"/>
                        </af:inputText>
                        <af:inputText value="#{bindings.ManagerId1.inputValue}"
                                      label="#{bindings.ManagerId1.hints.label}"
                                      required="#{bindings.ManagerId1.hints.mandatory}"
                                      columns="#{bindings.ManagerId1.hints.displayWidth}"
                                      maximumLength="#{bindings.ManagerId1.hints.precision}"
                                      shortDesc="#{bindings.ManagerId1.hints.tooltip}"
                                      id="it7">
                          <f:validator binding="#{bindings.ManagerId1.validator}"/>
                          <af:convertNumber groupingUsed="false"
                                            pattern="#{bindings.ManagerId1.format}"/>
                        </af:inputText>
                        <af:inputText value="#{bindings.DepartmentId1.inputValue}"
                                      label="#{bindings.DepartmentId1.hints.label}"
                                      required="#{bindings.DepartmentId1.hints.mandatory}"
                                      columns="#{bindings.DepartmentId1.hints.displayWidth}"
                                      maximumLength="#{bindings.DepartmentId1.hints.precision}"
                                      shortDesc="#{bindings.DepartmentId1.hints.tooltip}"
                                      id="it5">
                          <f:validator binding="#{bindings.DepartmentId1.validator}"/>
                          <af:convertNumber groupingUsed="false"
                                            pattern="#{bindings.DepartmentId1.format}"/>
                        </af:inputText>
                        <f:facet name="footer">
                          <af:commandButton text="Submit" id="cb5"/>
                        </f:facet>
                      </af:panelFormLayout>
                    </af:showDetailItem>
                    <af:showDetailItem text="Graph" id="sdi4">
                      <dvt:barGraph id="barGraph1"
                                    value="#{bindings.EmployeesView31.graphModel}"
                                    subType="BAR_VERT_CLUST"
                                    threeDEffect="true"
                                    animationOnDisplay="auto">
                        <dvt:background>
                          <dvt:specialEffects/>
                        </dvt:background>
                        <dvt:graphPlotArea/>
                        <dvt:seriesSet>
                          <dvt:series/>
                        </dvt:seriesSet>
                        <dvt:o1Axis/>
                        <dvt:y1Axis/>
                        <dvt:legendArea automaticPlacement="AP_NEVER"/>
                      </dvt:barGraph>
                    </af:showDetailItem>
                  </af:panelTabbed>
                </f:facet>
              </af:panelSplitter>
            </f:facet>
          </af:panelSplitter>
          <!-- id="af_one_column_stretched"   -->
        </f:facet>
      </af:panelStretchLayout>
    </af:form>
  </af:document>
</f:view>