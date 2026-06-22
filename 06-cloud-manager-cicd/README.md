# Cloud Manager CI/CD

Generic AEM as a Cloud Service delivery workflow.

```mermaid
flowchart LR
    A[Feature Branch] --> B[Pull Request]
    B --> C[Code Review]
    C --> D[CI Build]
    D --> E[Cloud Manager Pipeline]
    E --> F[Dev / Stage]
    F --> G[Production Approval]
    G --> H[Production Deployment]
```
