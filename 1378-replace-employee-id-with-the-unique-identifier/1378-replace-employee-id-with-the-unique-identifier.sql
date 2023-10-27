-- Start by selecting the columns we want in our result.
SELECT 
    e.name,       -- We want the name of the employee.
    eu.unique_id  -- We also want the unique ID of the employee.
FROM 
    Employees e  -- We alias the Employees table as 'e' for shorthand in our query.

-- We want to combine information from both the Employees and EmployeeUNI tables.
-- So, we use a LEFT JOIN. This type of JOIN ensures that even if an employee doesn't have a unique ID,
-- we'll still get their name in the result with a 'null' in the unique_id column.
LEFT JOIN 
    EmployeeUNI eu  -- We alias the EmployeeUNI table as 'eu' for shorthand in our query.

-- The 'ON' keyword tells the database how to match rows from both tables.
ON 
    e.id = eu.id;  -- We match rows where the id in the Employees table is the same as the id in the EmployeeUNI table.