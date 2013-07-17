
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DBSchema">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="DBSchemaType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBSchema")
public class DBSchema
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "DBSchemaType")
    @XmlSchemaType(name = "anySimpleType")
    protected String dbSchemaType;

    /**
     * Gets the value of the dbSchemaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBSchemaType() {
        return dbSchemaType;
    }

    /**
     * Sets the value of the dbSchemaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBSchemaType(String value) {
        this.dbSchemaType = value;
    }

}
