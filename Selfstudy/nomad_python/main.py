import requests
from bs4 import BeautifulSoup

indeed_result = requests.get("https://www.indeed.com/jobs?q=python&limit=50")

# print(indeed_result.text)

indeed_soup = BeautifulSoup(indeed_result.text, "html.parser")
# print(indeed_soup)

pagination = indeed_soup.find("div", {"class":"pagination"})

# print(pagination)
pages = pagination.find_all('a')
spans = []
# print(pages)

for page in pages:
    # print(page.find("span"))
    spans.append(page.find("span"))
spans = spans[0:-1]