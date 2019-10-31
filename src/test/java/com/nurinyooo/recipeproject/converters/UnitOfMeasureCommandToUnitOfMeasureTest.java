package com.nurinyooo.recipeproject.converters;

import com.nurinyooo.recipeproject.commands.UnitOfMeasureCommand;
import com.nurinyooo.recipeproject.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitOfMeasureCommandToUnitOfMeasureTest {

    public static final String DESCRIPTION ="description";
    public static final Long LONG_VALUE = new Long(1L);

    UnitOfMeasureCommandToUnitOfMeasure converter;

    @Before
    public void setUp() throws Exception {
        converter = new UnitOfMeasureCommandToUnitOfMeasure();
    }
    @Test
    public void testNullParameter() throws Exception{
        assertNull(converter.convert(null));
    }
    @Test
    public void testEmptyObject() throws Exception{
        assertNotNull(converter.convert(new UnitOfMeasureCommand()));
    }
    @Test
    public void convert() {
        UnitOfMeasureCommand command = new UnitOfMeasureCommand();
        command.setId(LONG_VALUE);
        command.setDescription(DESCRIPTION);

        UnitOfMeasure uom = converter.convert(command);

        assertNotNull(uom);
        assertEquals(LONG_VALUE,uom.getId());
        assertEquals(DESCRIPTION,uom.getDescription());
    }
}