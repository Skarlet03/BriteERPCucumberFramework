package com.cybertek.utilities;

import com.cybertek.pages.*;

public class Pages {
    private EntryPage entryPage;
    private HeaderNavigationBar headerNavigationBar;
    private HomePage homePage;
    private IncomingProdsPage incomingProdsPage;
    private LoginPage loginPage;
    private NewRFQPage newRFQPage;
    private ProductsPage productsPage;
    private PurchaseOrdersPage purchaseOrdersPage;
    private PurchasesPage purchasesPage;
    private ReportingPage reportingPage;
    private RequestsForQuotation requestsForQuotation;
    private SideBar sideBar;
    private SubNavigationPage subNavigationPage;
    private TempRequestsForQuotation tempRequestsForQuotation;
    private VendorBillsPage vendorBillsPage;
    private VendorsPage vendorsPage;


    public EntryPage entryPage() {
        if (entryPage == null) {
            entryPage = new EntryPage();
        }
        return entryPage;
    }

    public HeaderNavigationBar headerNavigationBar() {
        if (headerNavigationBar == null) {
            headerNavigationBar = new HeaderNavigationBar();
        }
        return headerNavigationBar;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }


    public IncomingProdsPage incomingProdsPage() {
        if (incomingProdsPage == null) {
            incomingProdsPage = new IncomingProdsPage();
        }
        return incomingProdsPage;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public NewRFQPage newRFQPag() {
        if (newRFQPage == null) {
            newRFQPage = new NewRFQPage();
        }
        return newRFQPage;
    }

    public ProductsPage productsPage() {
        if (productsPage == null) {
            productsPage = new ProductsPage();
        }
        return productsPage;
    }

    public PurchaseOrdersPage purchaseOrdersPage() {
        if (purchaseOrdersPage == null) {
            purchaseOrdersPage = new PurchaseOrdersPage();
        }
        return purchaseOrdersPage;
    }

    public PurchasesPage purchasesPage() {
        if (purchasesPage == null) {
            purchasesPage = new PurchasesPage();
        }
        return purchasesPage;
    }

    public ReportingPage reportingPage() {
        if (reportingPage == null) {
            reportingPage = new ReportingPage();
        }
        return reportingPage;
    }

    public RequestsForQuotation requestsForQuotation() {
        if (requestsForQuotation == null) {
            requestsForQuotation = new RequestsForQuotation();
        }
        return requestsForQuotation;
    }

    public SideBar sideBar() {
        if (requestsForQuotation == null) {
            sideBar = new SideBar();
        }
        return sideBar;
    }

    public SubNavigationPage subNavigationPage() {
        if (subNavigationPage == null) {
            subNavigationPage = new SubNavigationPage();
        }
        return subNavigationPage;
    }

    public TempRequestsForQuotation tempRequestsForQuotation() {
        if (tempRequestsForQuotation == null) {
            tempRequestsForQuotation = new TempRequestsForQuotation();
        }
        return tempRequestsForQuotation;
    }
    public VendorBillsPage vendorBillsPage() {
        if (vendorBillsPage == null) {
            vendorBillsPage = new VendorBillsPage();
        }
        return vendorBillsPage;
    }
    public VendorsPage vendorsPage() {
        if (vendorsPage == null) {
            vendorsPage = new VendorsPage();
        }
        return vendorsPage;
    }
}

