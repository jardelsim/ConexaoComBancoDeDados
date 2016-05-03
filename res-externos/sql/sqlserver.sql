CREATE TABLE [dbo].[pessoa] (
    [id]        INT          IDENTITY (1, 1) NOT NULL,
    [nome]      VARCHAR (30) NOT NULL,
    [sobrenome] VARCHAR (50) NOT NULL,
    [email]     VARCHAR (50) NOT NULL,
    [cpf]     VARCHAR (11) NOT NULL,
    PRIMARY KEY CLUSTERED ([id] ASC)
);



jdbc:sqlserver://galatico.database.windows.net:1433;database=marte;user=jardel@galatico;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;