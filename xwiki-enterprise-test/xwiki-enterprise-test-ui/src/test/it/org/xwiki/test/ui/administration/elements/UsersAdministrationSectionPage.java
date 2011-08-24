/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.test.ui.administration.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.xwiki.test.ui.framework.elements.RegisterPage;

/**
 * Represents the actions possible on the Users Administration Page.
 *
 * @version $Id$
 * @since 2.4M1
 */
public class UsersAdministrationSectionPage extends AdministrationSectionPage
{
    @FindBy(id = "addNewUser")
    private WebElement addNewUserButton;

    /**
     * @since 3.2M3
     */
    public static UsersAdministrationSectionPage gotoPage()
    {
        UsersAdministrationSectionPage page = new UsersAdministrationSectionPage();
        page.getDriver().get(page.getURL());
        return page;
    }

    public UsersAdministrationSectionPage()
    {
        super("Users");
    }

    public RegisterPage clickAddNewUser()
    {
        this.addNewUserButton.click();
        RegisterPage rp = new LightBoxRegisterPage();
        return rp;
    }
}
