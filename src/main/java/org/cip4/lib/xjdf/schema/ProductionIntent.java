
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductionIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;attribute name="PrintPreference" type="{http://www.CIP4.org/JDFSchema_2_0}EnumPrintPreference" />
 *       &lt;attribute name="PrintProcess" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionIntent")
public class ProductionIntent
    extends IntentType
    implements Serializable
{

    @XmlAttribute(name = "PrintPreference")
    protected EnumPrintPreference printPreference;
    @XmlAttribute(name = "PrintProcess")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String printProcess;

    /**
     * Gets the value of the printPreference property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPrintPreference }
     *     
     */
    public EnumPrintPreference getPrintPreference() {
        return printPreference;
    }

    /**
     * Sets the value of the printPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPrintPreference }
     *     
     */
    public void setPrintPreference(EnumPrintPreference value) {
        this.printPreference = value;
    }

    /**
     * Gets the value of the printProcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintProcess() {
        return printProcess;
    }

    /**
     * Sets the value of the printProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintProcess(String value) {
        this.printProcess = value;
    }

}
