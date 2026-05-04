# 2BL23CS183-RecentlyViewedItems
This project implements a "Recently Viewed Items" feature using Cookies in Java Servlets.  When a user clicks on product buttons, the last 3 viewed products are stored in a cookie  and displayed on the screen.

# Recently Viewed Items (Servlet + Cookie)

## 📌 Description
This project implements a "Recently Viewed Items" feature using Cookies in Java Servlets. 
When a user clicks on product buttons, the last 3 viewed products are stored in a cookie 
and displayed on the screen.

## 🎯 Objective
- Track recently viewed products
- Store data using cookies
- Display last 3 items dynamically

## 🛠 Technologies Used
- Java (JDK 17+)
- Servlet (Jakarta)
- HTML
- Apache Tomcat Server
- Eclipse IDE

## 📁 Folder Structure
RecentlyViewedItems/
│
├── src/main/java/com/tara/RecentServlet.java
├── src/main/webapp/index.html
├── src/main/webapp/WEB-INF/web.xml
├── screenshots/
└── README.md

## ⚙️ Requirements
- JDK 17 or above
- Eclipse IDE
- Apache Tomcat v10.1
- Web browser (Chrome/Edge)

## ▶️ How to Run
1. Open Eclipse
2. Create Dynamic Web Project (RecentlyViewedItems)
3. Add Tomcat Server
4. Add all files in correct folders
5. Right click project → Run As → Run on Server
6. Open browser and go to:
   http://localhost:8081/RecentlyViewedItems/index.html

## 💡 Working
- User clicks a product button
- Servlet receives product name
- Cookie stores products in comma-separated format
- Only last 3 items are kept
- Output shows recently viewed items

## 📊 Output
Example:
Product1  
Product2, Product1  
Product3, Product2, Product1  

## 📸 Screenshots
Add output screenshots inside "screenshots" folder

## 👩‍💻 Author
Vijayalaxmi Sasanoor
