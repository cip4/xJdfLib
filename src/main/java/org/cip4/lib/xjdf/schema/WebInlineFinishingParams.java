
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebInlineFinishingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebInlineFinishingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FolderProduction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebInlineFinishingParams", propOrder = {
    "folderProductions"
})
public class WebInlineFinishingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "FolderProduction")
    protected List<FolderProduction> folderProductions;

    /**
     * Gets the value of the folderProductions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderProductions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderProductions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderProduction }
     * 
     * 
     */
    public List<FolderProduction> getFolderProductions() {
        if (folderProductions == null) {
            folderProductions = new ArrayList<FolderProduction>();
        }
        return this.folderProductions;
    }

}
