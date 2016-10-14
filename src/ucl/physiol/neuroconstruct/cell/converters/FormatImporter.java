/**
 *  neuroConstruct
 *  Software for developing large scale 3D networks of biologically realistic neurons
 * 
 *  Copyright (c) 2009 Padraig Gleeson
 *  UCL Department of Neuroscience, Physiology and Pharmacology
 *
 *  Development of this software was made possible with funding from the
 *  Medical Research Council and the Wellcome Trust
 *  
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.

 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package ucl.physiol.neuroconstruct.cell.converters;

import java.io.*;

import ucl.physiol.neuroconstruct.cell.*;

/**
 *
 * Abstract class for all the external format morphology importers
 * See SWCMorphReader for a simple example of an implementation
 *
 * @author Padraig Gleeson
 *  
 *
 */

public abstract class FormatImporter
{
    private String name = null;
    private String desc = null;
    private String[] fileExtensions = null;

    //private static FormatImporter myInstance = null;


    protected FormatImporter()
    {
    }

    protected FormatImporter(String name, String desc, String[] fileExtensions)
    {
        this.name = name;
        this.desc = desc;
        this.fileExtensions = fileExtensions;
    }




    public abstract Cell loadFromMorphologyFile(File morphologyFile, String name) throws MorphologyException;

    public String getDesc()
    {
        return desc;
    }
    public String[] getFileExtensions()
    {
        return fileExtensions;
    }
    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return name + " ("+desc+")";
    }
    
    
    public String getWarnings()
    {
        return "";
    }


}
