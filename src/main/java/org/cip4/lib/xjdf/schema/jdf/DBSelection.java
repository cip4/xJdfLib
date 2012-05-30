
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBSelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DBSelection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Select" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Records" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="DataBase" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBSelection")
public class DBSelection
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Select")
    protected String select;
    @XmlAttribute(name = "Records")
    protected Integer records;
    @XmlAttribute(name = "DataBase")
    protected String dataBase;

    /**
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelect(String value) {
        this.select = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecords(Integer value) {
        this.records = value;
    }

    /**
     * Gets the value of the dataBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataBase() {
        return dataBase;
    }

    /**
     * Sets the value of the dataBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataBase(String value) {
        this.dataBase = value;
    }

}
