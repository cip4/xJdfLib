package org.cip4.lib.xjdf.schema;

import org.cip4.lib.xjdf.xml.XJdfValidator;
import org.junit.Ignore;
import org.junit.Test;


public class ForeignNamespaces {

    @Test
    @Ignore("Currently custom attributes are not allowed by the schema. Solution is discussed in XJDF-39")
    public void attributesAllowedAnywhere() throws Exception {
        XJdfValidator validator = new XJdfValidator();
        validator.validate(this.getClass().getResourceAsStream("attributeFromForeignNS.xjdf"));
    }
}
