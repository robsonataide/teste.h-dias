package app;
public class TenantContext {

	private ThreadLocal<String> tenantContext = new ThreadLocal<>();

    public static final String TENANT_ID = "tentant-company";

    private static String tenantId = "8BCC92A0-AE9B-4FB2-B32A-94E0506BCEFC";

    public static String getTenant() {
        return TenantContext.tenantId;
    }
    
    public static void setTenant(String tenantId) {
        TenantContext.tenantId = tenantId;
    }
}
