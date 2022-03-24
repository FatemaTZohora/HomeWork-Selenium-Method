package hw_selenium_method;

public class HW_15_dynamicXpath {
	/*
	 * Tag with a single attribute:
 
Formula: //htmltag[@attributeName='attributeValue']

Source: https://www.amazon.com/

1.  //span[@id='glow-ingress-line2']
2.  //input[@id='twotabsearchtextbox']
3.  //div[@class='nav-line-1-container']
4.  //select[@id='searchDropdownBox']
5.  //a[@id='nav-logo-sprites']


 *  Tag with multiple attribute with 'or' logic :
 
Formula: //html tag [@attribute name = 'attribute value' or @attribute name = 'attribute value']
 
1.  //img[@class='block' or @alt='BestBuy.com']
2.  //span[@class='nav-line-2 nav-progressive-content' or @id='glow-ingress-line2']      
3.  //select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown' or  @name='url']
4.  //img[@class='logo-image img-responsive img-fluid' or @alt='The official website of Louisiana']
5.  //a[@class='side-accessibility-btn' or @title='Accessibility Tools']

 *  Tag with multiple attribute with 'and' logic :
 
Formula: //html tag [@attribute name = 'attribute value' and @attribute name = 'attribute value']
 
1.  //button[@class='c-button-unstyled hamburger-menu-button' and @type='button']       //source: bestbuy.com
2.  //a[@class='bottom-left-links ' and @data-lid='hdr_topdeals']
3.  //img[@class='logo-image img-responsive img-fluid' and @alt='The official website of Louisiana']
4.  //div[@class='bubble' and @style='background: rgb(13, 71, 161);']                                //sourse:https://www.louisiana.gov/
5.   //input[@id = 'nav-search-submit-button' and @class = 'nav-input nav-progressive-attribute']

* Tag with inner text :

Formula: //html tag [text() = 'inner text value' ]
 
  source : https://www.amazon.com/
  1. //a[text()='Gift Cards']
  2. //a[text()='Amazon Home']
  3. //a[text()='New Releases']
  4. //a[text()='Find out how']
  5. //a[text()='Fashion']

* Tag with inner text using contains :

Formula: //html tag [contains(text(), 'partial or complete inner text value') ]
 
source : https://www.cms.gov/
1. //a[contains(text(), 'Regulations & Guidance')]
2. //a[contains(text(), 'Reducing opioid misuse')]
3. //a [contains(text(), 'Flu shot outreach: Find materials & ')]
4. //a [contains(text(), 'Internet-Only Manuals (IOMs)')]
5. //a [contains(text(), 'Policies & Important Links')]

*   Tag with attributes and use of contains :

Formula: //html tag [contains(@attribute, 'attribute value') ]
  
  
1. //img [contains(@class, 'visible-lg')]
2. //button[contains(@class, 'c-button-unstyled store-loc-btn')]
3. //div [contains(@style, 'text-align:left')]
4. //a[contains(@class, 'v-text-tech-yellow')]
5. //span[contains(@class, 'store-info-name')]

*   Normalize space -- eliminates leading and trailing spaces.

Formula: //html tag [normalize-space(text())='attribute value']
 
 1. //a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']
 2. //a[normalize-space(text())='Community Reinvestment Act']
 3. //a[normalize-space(text())='Truist Leadership Institute']             //source: https://www.truist.com/  
 4. //a[normalize-space(text())= 'Facts about banking']
 5. //a[normalize-space(text())= 'Money and Mindset']
 
 *  Starts with text.
 
      Formula: //html tag [starts-with(text(), 'attribute value')]
 
1. //span[starts-with(text(), 'Relentlessly pursuing a diverse culture')]        
2. //span[starts-with(text(), 'The heart of innovation')]
3. //span[starts-with(text(), 'Creating an impact. Fueling change.')]
4. //span[starts-with(text(), 'Sustainability for the future')]
5. //span[starts-with(text(), 'Get paid for your morning coffee.')]
 
 
* Starts with attribute

     Formula: //html tag [starts-with(@attributes, 'attribute value')]
 
1. //button[starts-with(@class, 'btn goal-find')]
2. //a[starts-with(@class, 'splide__slide journey-item thirdJourney is-visible')]
3. //img[starts-with(@class, 'truist-globalnav-logo-image d-inline-block')]
4. //a[starts-with(@id, 'signOnComp')]
5. //span[starts-with(@id, 'truist-global-nav-more-text')]

	 */

}
