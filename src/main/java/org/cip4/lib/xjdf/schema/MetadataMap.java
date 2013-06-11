
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Expr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ValueFormat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Context" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ValueTemplate" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="DataType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Name" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "expr"
})
@XmlRootElement(name = "MetadataMap")
public class MetadataMap
    implements Serializable
{

    @XmlElement(name = "Expr")
    protected List<Expr> expr;
    @XmlAttribute(name = "ValueFormat")
    protected String valueFormat;
    @XmlAttribute(name = "Context")
    @XmlSchemaType(name = "anySimpleType")
    protected String context;
    @XmlAttribute(name = "ValueTemplate")
    protected String valueTemplate;
    @XmlAttribute(name = "DataType")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataType;
    @XmlAttribute(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    /**
     * Gets the value of the expr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expr }
     * 
     * 
     */
    public List<Expr> getExpr() {
        if (expr == null) {
            expr = new ArrayList<Expr>();
        }
        return this.expr;
    }

    /**
     * Gets the value of the valueFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueFormat() {
        return valueFormat;
    }

    /**
     * Sets the value of the valueFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueFormat(String value) {
        this.valueFormat = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the valueTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueTemplate() {
        return valueTemplate;
    }

    /**
     * Sets the value of the valueTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueTemplate(String value) {
        this.valueTemplate = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
