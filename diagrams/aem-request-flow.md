```mermaid
sequenceDiagram
Browser->>CDN: Request page
CDN->>Dispatcher: Cache miss
Dispatcher->>AEM Publish: Forward request
AEM Publish-->>Dispatcher: HTML response
Dispatcher-->>Browser: Cached response
```
